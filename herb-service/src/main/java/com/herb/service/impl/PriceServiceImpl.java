package com.herb.service.impl;

import com.alibaba.fastjson.JSON;
import com.herb.common.util.HttpClientUtil;
import com.herb.mbg.mapper.HerbMapper;
import com.herb.mbg.mapper.PriceMapper;
import com.herb.mbg.model.Herb;
import com.herb.mbg.model.HerbExample;
import com.herb.mbg.model.Price;
import com.herb.service.PriceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PriceServiceImpl implements PriceService {

    @Resource
    private PriceMapper priceMapper;
    @Resource
    private HerbMapper herbMapper;

    @Override
    public void add(Price price) {
        priceMapper.insert(price);
    }

    @Override
    public void update(Price price) {
        priceMapper.updateByPrimaryKey(price);
    }

    @Override
    public void delete(Long id) {
        priceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void save() {
        // 查询所有药草
        List<Herb> herbs = herbMapper.selectByExample(new HerbExample());
        Map<Long, String> herbMap = herbs.stream()
                .collect(Collectors.toMap(Herb::getId, Herb::getName));
        for (String herb : herbMap.values()) {

        }

        String url = "https://www.kmzyw.com.cn/jiage/resouces/jsp/price_history_todaypricecompare.jsp";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("name", "%E7%99%BD%E6%9C%AF");
        paramMap.put("standard", "%E7%BB%9F");
        paramMap.put("origin", "%E5%AE%89%E5%BE%BD");
        paramMap.put("site", "%E4%BA%B3%E5%B7%9E");
        String respStr = HttpClientUtil.doPost(url, new HashMap<>(), paramMap);
        Price price = JSON.parseObject(respStr, Price.class);
        priceMapper.insert(price);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
//        String encode = URLEncoder.encode("");
        String decode = URLDecoder.decode("%E7%99%BD%E6%9C%AF", "UTF-8");
        System.out.println(decode);
    }

    public void buildRequest() {
        Map<Long, String> herbMap = new HashMap<>();
        List<Map<String, String>> paramList = new ArrayList<>();
        for (String herb : herbMap.values()) {
            Map<String, String> paramMap = new HashMap<>();
            paramMap.put("name", herb);

        }
    }
}
