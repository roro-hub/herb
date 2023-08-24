package com.herb.bo;

import com.herb.mbg.model.Price;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

@Data
public class PriceChartBO {

    private Map<Date, BigDecimal> map;
    private Price price;
}
