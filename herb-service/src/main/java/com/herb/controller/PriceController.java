package com.herb.controller;

import com.herb.bo.PriceChartBO;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Price;
import com.herb.service.PriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "PriceController", value = "价格信息")
@RequestMapping("/price")
public class PriceController {

    @Resource
    private PriceService priceService;

    @ApiOperation("药材数据")
    @PostMapping("/today")
    @ResponseBody
    public CommonResult<Price> today(@RequestBody Price price) {
        Price result = priceService.today(price);
        return CommonResult.success(result);
    }

    @ApiOperation("历史一年内价格浮动数据")
    @PostMapping("/chart")
    @ResponseBody
    public CommonResult<PriceChartBO> chart(@RequestBody Price price) {
        PriceChartBO result = priceService.chart(price);
        return CommonResult.success(result);
    }
}
