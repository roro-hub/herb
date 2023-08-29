package com.herb.service;

import com.herb.mbg.model.Sales;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface SalesService {

    void add(Sales sales);

    void update(Sales bo);

    void delete(Long id);

    Sales get(Long id);

    List<Sales> list(String name,
                     String type,
                     Long herbId,
                     String recordMonth,
                     Integer pageSize,
                     Integer pageNum);

    Map<String, Map<String, BigDecimal>> recently(List<String> names, Integer month, String type);

    Set<String> getHerbList(Integer month, String type);
}
