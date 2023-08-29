package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.bo.PriceChartBO;
import com.herb.bo.PriceTodayBO;
import com.herb.common.api.CommonPage;
import com.herb.common.util.PageUtil;
import com.herb.dao.PriceDao;
import com.herb.dto.PriceDto;
import com.herb.mbg.mapper.HerbMapper;
import com.herb.mbg.mapper.PriceMapper;
import com.herb.mbg.model.Price;
import com.herb.mbg.model.PriceExample;
import com.herb.service.PriceService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class PriceServiceImpl implements PriceService {

    @Resource
    private HerbMapper herbMapper;
    @Resource
    private PriceMapper priceMapper;
    @Resource
    private PriceDao priceDao;

    @Override
    public List<Price> list(String name, String standard, String origin, String site,
                            Integer pageNum, Integer pageSize, String orderBy, String sort) {
        PageHelper.startPage(pageNum, pageSize, PageUtil.getOrderBy(orderBy, sort));
        return select(name, standard, origin, site);
    }

    private List<Price> select(String name, String standard, String origin, String site) {
        PriceExample example = new PriceExample();
        PriceExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameEqualTo(name);
        }
        if (StringUtils.isNotBlank(standard)) {
            criteria.andStandardEqualTo(standard);
        }
        if (StringUtils.isNotBlank(origin)) {
            criteria.andOriginEqualTo(origin);
        }
        if (StringUtils.isNotBlank(site)) {
            criteria.andSiteEqualTo(site);
        }
        return priceMapper.selectByExample(example);
    }

    @Override
    public PriceChartBO history(String name, String standard, String origin, String site) {
        PriceExample example = new PriceExample();
        example.createCriteria()
                .andNameEqualTo(name)
                .andStandardEqualTo(standard)
                .andOriginEqualTo(origin)
                .andSiteEqualTo(site)
                .andNewdateBetween(DateUtils.addYears(new Date(), -1), new Date());
        List<Price> prices = priceMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(prices)) {
            return null;
        }
        PriceChartBO result = new PriceChartBO();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        TreeMap<String, BigDecimal> map = new TreeMap<>();
        prices.forEach(p -> {
            map.put(sdf.format(p.getNewdate()), p.getNewprice());
        });
        result.setPrice(prices.get(0));
        result.setMap(map);
        return result;
    }

    @Override
    public Map<String, Map<String, BigDecimal>> recently(String herbName,
                                                         String origin,
                                                         String site,
                                                         Integer month) {
        Date startDate = null;
        Date endDate = null;
        if (month != null && month > 0) {
            startDate = new java.sql.Date(DateUtils.addMonths(new Date(), -month).getTime());
            endDate = new java.sql.Date(new Date().getTime());
        }
        List<PriceDto> prices = priceDao.groupByMonth(herbName,
                origin,
                site,
                startDate,
                endDate);
        Map<String, Map<String, BigDecimal>> result = new HashMap<>();
        prices.forEach(p -> {
            Map<String, BigDecimal> dateMap = result.get(p.getStandard());
            if (MapUtils.isEmpty(dateMap)) {
                dateMap = new HashMap<>();
            }
            dateMap.put(p.getDate(), p.getNewprice());
            result.put(p.getStandard(), dateMap);
        });
        return result;
    }

    @Override
    public Map<String, BigDecimal> latestSite(String name, String standard, String origin) {
        Date latestDate = priceDao.getLatestDate();
        PriceExample example = new PriceExample();
        example.createCriteria()
                .andNameEqualTo(name)
                .andStandardEqualTo(standard)
                .andOriginEqualTo(origin)
                .andNewdateEqualTo(latestDate);
        List<Price> prices = priceMapper.selectByExample(example);
        Map<String, BigDecimal> result = new HashMap<>();
        for (Price price : prices) {
            result.put(price.getSite(), price.getNewprice());
        }
        return result;
    }

    @Override
    public List<String> site(String name, String standard, String origin) {
        Date endDate = DateUtils.addYears(new Date(), -1);
        return priceDao.getSiteList(name, standard, origin, endDate, new Date());
    }

    @Override
    public CommonPage<PriceTodayBO> latestList(Integer pageNum, Integer pageSize) {
        Date latestDate = priceDao.getLatestDate();
        PriceExample example = new PriceExample();
        example.createCriteria().andNewdateEqualTo(latestDate);
        List<Price> prices = priceMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(prices)) {
            return new CommonPage<>();
        }
        Map<String, Map<String, BigDecimal>> map = new HashMap<>();
        for (Price price : prices) {
            String key = price.getName() + "_" + price.getStandard() + "_" + price.getOrigin();
            Map<String, BigDecimal> siteMap = map.get(key);
            if (MapUtils.isEmpty(siteMap)) {
                siteMap = new HashMap<>();
            }
            siteMap.put(price.getSite(), price.getNewprice());
            map.put(key, siteMap);
        }
        List<PriceTodayBO> list = new ArrayList<>();
        for (Map.Entry<String, Map<String, BigDecimal>> entry : map.entrySet()) {
            String key = entry.getKey();
            String[] keyArr = key.split("_");
            Map<String, BigDecimal> siteMap = entry.getValue();
            PriceTodayBO bo = PriceTodayBO.builder()
                    .name(keyArr[0])
                    .standard(keyArr[1])
                    .origin(keyArr[2])
                    .newdate(latestDate)
                    .haozhou(siteMap.get("亳州"))
                    .anguo(siteMap.get("安国"))
                    .chengdu(siteMap.get("成都"))
                    .yulin(siteMap.get("玉林"))
                    .lianqiao(siteMap.get("廉桥"))
                    .puning(siteMap.get("普宁"))
                    .build();
            list.add(bo);
        }
        CommonPage<PriceTodayBO> result = CommonPage.restPage(list);
        int startIndex = (pageNum - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, list.size());
        result.setList(list.subList(startIndex, endIndex));
        result.setPageSize(pageSize);
        return result;
    }
}


