package com.herb.controller;

import com.herb.bo.PriceChartBO;
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

    @ApiOperation("当天药材数据")
    @PostMapping("/today")
    @ResponseBody
    public CommonResult<Price> today(@RequestBody Price price) {
        Price result = priceService.today(price);
        return CommonResult.success(result);
    }

    @ApiOperation("药材分页查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Price>> list(@RequestParam(value = "name", required = false) String name,
                                                @RequestParam(value = "standard", required = false) String standard,
                                                @RequestParam(value = "origin", required = false) String origin,
                                                @RequestParam(value = "site", required = false) String site,
                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize) {
        List<Price> list = priceService.list(name, standard, origin, site, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("历史一年内价格浮动数据")
    @PostMapping("/history")
    @ResponseBody
    public CommonResult<PriceChartBO> history(@RequestBody Price price) {
        PriceChartBO result = priceService.history(price);
        return CommonResult.success(result);
    }

    @ApiOperation("最近五个月药材价格数据")
    @PostMapping("/recently")
    @ResponseBody
    public CommonResult<Map<String, Map<String, Map<String, BigDecimal>>>> recently(
            @RequestParam(value = "names", required = false) List<String> names,
            @RequestParam(value = "standards", required = false) List<String> standards,
            @RequestParam(value = "origin", required = false) String origin,
            @RequestParam(value = "site", required = false) String site) {
        Map<String, Map<String, Map<String, BigDecimal>>> result = priceService.recently(names, standards, origin, site);
        return CommonResult.success(result);
    }
}
