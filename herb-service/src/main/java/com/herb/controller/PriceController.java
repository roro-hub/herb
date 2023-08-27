package com.herb.controller;

import com.herb.bo.PriceChartBO;
import com.herb.bo.PriceTodayBO;
import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Price;
import com.herb.service.PriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "PriceController", value = "价格信息")
@RequestMapping("/price")
public class PriceController {

    @Resource
    private PriceService priceService;

    @ApiOperation("最近药材分页查询")
    @PostMapping("/latestList")
    @ResponseBody
    public CommonResult<CommonPage<PriceTodayBO>> latestList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                             @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        CommonPage<PriceTodayBO> list = priceService.latestList(pageNum, pageSize);
        return CommonResult.success(list);
    }

    @ApiOperation("药材分页查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Price>> list(@RequestParam(value = "name", required = false) String name,
                                                @RequestParam(value = "standard", required = false) String standard,
                                                @RequestParam(value = "origin", required = false) String origin,
                                                @RequestParam(value = "site", required = false) String site,
                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                @RequestParam(value = "orderBy", defaultValue = "create_time") String orderBy,
                                                @RequestParam(value = "sort", defaultValue = "desc") String sort) {
        List<Price> list = priceService.list(name, standard, origin, site, pageNum, pageSize, orderBy, sort);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("历史一年内价格浮动数据")
    @PostMapping("/history")
    @ResponseBody
    public CommonResult<PriceChartBO> history(@RequestBody Price price) {
        PriceChartBO result = priceService.history(price);
        return CommonResult.success(result);
    }

    @ApiOperation("最近几个月药材价格数据")
    @PostMapping("/recently")
    @ResponseBody
    public CommonResult<Map<String, Map<String, Map<String, BigDecimal>>>> recently(
            @RequestParam(value = "names", required = false) List<String> names,
            @RequestParam(value = "standards", required = false) List<String> standards,
            @RequestParam(value = "origin", required = false) String origin,
            @RequestParam(value = "site", required = false) String site,
            @RequestParam(value = "month", required = false) Integer month) {
        Map<String, Map<String, Map<String, BigDecimal>>> result = priceService.recently(names, standards, origin, site, month);
        return CommonResult.success(result);
    }

    @ApiOperation("查询最近药材产地数据")
    @PostMapping("/latestSite")
    @ResponseBody
    public CommonResult<Map<String, BigDecimal>> latestSite(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "standard") String standard,
            @RequestParam(value = "origin") String origin) {
        Map<String, BigDecimal> result = priceService.latestSite(name, standard, origin);
        return CommonResult.success(result);
    }

    @ApiOperation("查询药材近一年的市场")
    @PostMapping("/site")
    @ResponseBody
    public CommonResult<List<String>> site(@RequestParam(value = "name") String name,
                                           @RequestParam(value = "standard") String standard,
                                           @RequestParam(value = "origin") String origin) {
        List<String> result = priceService.site(name, standard, origin);
        return CommonResult.success(result);
    }
}
