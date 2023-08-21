package com.herb.service.impl;

import com.herb.mbg.mapper.WeatherMapper;
import com.herb.service.WeatherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Resource
    private WeatherMapper weatherMapper;

    @Override
    public void record() {

    }
}
