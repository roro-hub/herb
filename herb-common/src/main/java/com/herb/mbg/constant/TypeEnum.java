package com.herb.mbg.constant;

public enum TypeEnum {

    SERVE_LIST("serve_list", "服务清单"),
    MARKET_INTRODUCTION("market_introduction", "市场介绍"),
    HERB_INTRODUCTION("herb_introduction", "草堂介绍"),
    SOIL("soil", "土壤");

    private String code;
    private String value;



    TypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
