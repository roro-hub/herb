package com.herb.service;

import com.herb.bo.ProductBO;

import java.util.List;

public interface ProductService {

    void add(Product product);

    void update(ProductBO bo);

    List<Product> list(String name, Integer type, Integer pageSize, Integer pageNum);
}
