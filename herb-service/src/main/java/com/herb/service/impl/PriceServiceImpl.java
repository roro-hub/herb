package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.bo.PriceChartBO;
import com.herb.dao.PriceDao;
import com.herb.dto.PriceDto;
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
import java.util.stream.Collectors;

@Service
public class PriceServiceImpl implements PriceService {

    @Resource
    private PriceMapper priceMapper;
    @Resource
    private PriceDao priceDao;

    @Override
    public List<Price> list(String name, String standard, String origin, String site, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
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
            criteria.andStandardEqualTo(site);
        }
        return priceMapper.selectByExample(example);
    }

    @Override
    public PriceChartBO history(Price price) {
        PriceExample example = new PriceExample();
        example.createCriteria()
                .andNameEqualTo(price.getName())
                .andStandardEqualTo(price.getStandard())
                .andOriginEqualTo(price.getOrigin())
                .andSiteEqualTo(price.getSite())
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
    public Map<String, Map<String, Map<String, BigDecimal>>> recently(List<String> names,
                                                                      List<String> standards,
                                                                      String origin,
                                                                      String site,
                                                                      Integer month) {
        Date startDate = null;
        Date endDate = null;
        if (month != null && month > 0) {
            startDate = new java.sql.Date(DateUtils.addMonths(new Date(), -month).getTime());
            endDate = new java.sql.Date(new Date().getTime());
        }
        List<PriceDto> prices = priceDao.groupByMonth(names,
                standards,
                origin,
                site,
                startDate,
                endDate);
        Map<String, Map<String, Map<String, BigDecimal>>> result = new HashMap<>();
        prices.forEach(p -> {
            Map<String, Map<String, BigDecimal>> standardMap = result.get(p.getName());
            if (MapUtils.isEmpty(standardMap)) {
                standardMap = new HashMap<>();
            }
            Map<String, BigDecimal> dateMap = standardMap.get(p.getStandard());
            if (MapUtils.isEmpty(dateMap)) {
                dateMap = new HashMap<>();
            }
            dateMap.put(p.getDate(), p.getNewprice());
            standardMap.put(p.getStandard(), dateMap);
            result.put(p.getName(), standardMap);
        });
        return result;
    }

    @Override
    public Map<String, BigDecimal> todaySite(String name, String standard, String origin) {
        PriceExample example = new PriceExample();
        example.createCriteria()
                .andNameEqualTo(name)
                .andStandardEqualTo(standard)
                .andOriginEqualTo(origin)
                .andNewdateEqualTo(new Date());
        List<Price> prices = priceMapper.selectByExample(example);
        return prices.stream().collect(Collectors
                .toMap(Price::getSite, Price::getNewprice, (v1, v2) -> v1));
    }
}
