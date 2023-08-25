package com.herb.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PriceDto {

    private String name;
    private String standard;
    private String date;
    private BigDecimal newprice;
}
