package com.herb.service;

import com.herb.bo.PriceChartBO;
import com.herb.bo.PriceTodayBO;
import com.herb.common.api.CommonPage;
import com.herb.mbg.model.Price;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface PriceService {

    CommonPage<PriceTodayBO> latestList(Integer pageNum, Integer pageSize);

    List<Price> list(String name, String standard, String origin, String site,
                     Integer pageNum, Integer pageSize, String orderBy, String sort);

    PriceChartBO history(Price price);

    Map<String, Map<String, Map<String, BigDecimal>>> recently(List<String> names,
                                                               List<String> standards,
                                                               String origin,
                                                               String site,
                                                               Integer month);

    Map<String, BigDecimal> latestSite(String name, String standard, String origin);

    List<String> site(String name, String standard, String origin);
}
