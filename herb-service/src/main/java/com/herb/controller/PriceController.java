package com.herb.controller;

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

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody Price price) {
        priceService.add(price);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody Price price) {
        priceService.update(price);
        return CommonResult.success();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult<Void> delete(@PathVariable Long id) {
        priceService.delete(id);
        return CommonResult.success();
    }

    @ApiOperation("存储")
    @PostMapping("/save")
    @ResponseBody
    public CommonResult<Void> save() {
        priceService.save();
        return CommonResult.success();
    }

}
