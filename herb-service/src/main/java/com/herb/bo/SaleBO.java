package com.herb.bo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
public class SaleBO {

    private String name;

    private Map<String, BigDecimal> saleMap;
}
