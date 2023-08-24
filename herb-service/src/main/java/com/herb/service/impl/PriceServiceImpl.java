package com.herb.service.impl;

import com.herb.bo.PriceChartBO;
import com.herb.mbg.mapper.PriceMapper;
import com.herb.mbg.model.Price;
import com.herb.mbg.model.PriceExample;
import com.herb.service.PriceService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PriceServiceImpl implements PriceService {

    @Resource
    private PriceMapper priceMapper;

    @Override
    public Price today(Price price) {
        PriceExample example = new PriceExample();
        PriceExample.Criteria criteria = example.createCriteria().andNameEqualTo(price.getName());
        if (StringUtils.isNotBlank(price.getOrigin())) {
            criteria.andOriginEqualTo(price.getOrigin());
        }
        if (StringUtils.isNotBlank(price.getStandard())) {
            criteria.andStandardEqualTo(price.getStandard());
        }
        if (StringUtils.isNotBlank(price.getSite())) {
            criteria.andSiteEqualTo(price.getSite());
        }
        criteria.andNewdateEqualTo(new Date());
        List<Price> prices = priceMapper.selectByExample(example);
        return CollectionUtils.isEmpty(prices) ? new Price() : prices.get(0);
    }

    @Override
    public PriceChartBO chart(Price price) {
        PriceExample example = new PriceExample();
        example.createCriteria()
                .andNameEqualTo(price.getName())
                .andOriginEqualTo(price.getOrigin())
                .andStandardEqualTo(price.getStandard())
                .andSiteEqualTo(price.getSite())
                .andNewdateBetween(DateUtils.addYears(new Date(), -1), new Date());
        List<Price> prices = priceMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(prices)) {
            return null;
        }
        PriceChartBO result = new PriceChartBO();
        Map<Date, BigDecimal> priceMap = prices.stream()
                .collect(Collectors.toMap(Price::getNewdate, Price::getNewprice, (k1 , k2)-> k2));
        result.setPrice(prices.get(0));
        result.setMap(priceMap);
        return result;
    }
}
