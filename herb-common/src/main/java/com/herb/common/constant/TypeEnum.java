package com.herb.common.constant;

public enum TypeEnum {

    SERVE_LIST("serve_list", "服务清单"),
    market("market", "市场介绍"),
    cottage_INTRODUCTION("cottage", "草堂介绍"),
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
