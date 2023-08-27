package com.herb.common.util;


import org.springframework.util.StringUtils;

public class PageUtil {

    public static String getOrderBy(String orderByColumn, String sort) {
        if (StringUtils.isEmpty(orderByColumn)) {
            return "";
        }
        if (StringUtils.isEmpty(sort)) sort = "desc";
        return orderByColumn + " " + sort;
    }
}
