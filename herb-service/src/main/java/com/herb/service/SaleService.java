package com.herb.service;

import com.herb.bo.SaleBO;
import com.herb.mbg.model.Sale;

import java.util.List;

public interface SaleService {

    void add(Sale sale);

    void update(Sale bo);

    void delete(Long id);

    Sale get(Long id);

    List<Sale> list(String name, String recordMonth, Integer pageSize, Integer pageNum);

    List<SaleBO> charts(List<String> names);
}
