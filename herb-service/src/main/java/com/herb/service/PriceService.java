package com.herb.service;

import com.herb.bo.PriceChartBO;
import com.herb.mbg.model.Price;

public interface PriceService {

    Price today(Price price);

    PriceChartBO chart(Price price);
}
