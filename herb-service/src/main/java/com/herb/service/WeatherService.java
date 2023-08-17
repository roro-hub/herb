package com.herb.service;

import com.herb.mbg.model.Weather;

public interface WeatherService {

    Weather getLately();

    void record();

}
