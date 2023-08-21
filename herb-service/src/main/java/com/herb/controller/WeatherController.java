package com.herb.controller;

import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Weather;
import com.herb.service.WeatherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "WeatherController", value = "天气信息")
@RequestMapping("/weather")
public class WeatherController {

    @Resource
    private WeatherService weatherService;

    @ApiOperation("获取最近的天气情况")
    @GetMapping
    @ResponseBody
    public CommonResult<Weather> get() {
        return CommonResult.success();
    }
}
