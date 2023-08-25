package com.herb.service;

import com.herb.bo.PriceChartBO;
import com.herb.mbg.model.Price;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface PriceService {

    Price today(Price price);

    List<Price> list(String name, String standard, String origin, String site, Integer pageNum, Integer pageSize);

    PriceChartBO history(Price price);

    Map<String, Map<String, Map<String, BigDecimal>>> recently(List<String> names,
                                                               List<String> standards,
                                                               String origin,
                                                               String site);
}
