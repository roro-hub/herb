package com.herb.service;

import com.herb.mbg.model.Price;

public interface PriceService {

    void add(Price price);

    void update(Price price);

    void delete(Long id);

    void save();
}
