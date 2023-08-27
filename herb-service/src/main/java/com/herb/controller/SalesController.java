package com.herb.controller;

import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Sales;
import com.herb.service.SalesService;
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
@Api(tags = "SalesController", value = "药材销量")
@RequestMapping("/sales")
public class SalesController {

    @Resource
    private SalesService salesService;
    
    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody Sales sales) {
        salesService.add(sales);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody Sales sales) {
        salesService.update(sales);
        return CommonResult.success();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult<Void> delete(@PathVariable Long id) {
        salesService.delete(id);
        return CommonResult.success();
    }

    @ApiOperation("详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<Sales> get(@PathVariable Long id) {
        Sales sales = salesService.get(id);
        return CommonResult.success(sales);
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Sales>> list(@RequestParam(value = "name", required = false) String name,
                                                @RequestParam(value = "type", required = false) String type,
                                                @RequestParam(value = "herbId", required = false) Long herbId,
                                                @RequestParam(value = "recordMonth", required = false) String recordMonth,
                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<Sales> list = salesService.list(name, type, herbId, recordMonth, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }
    
    @ApiOperation("查询近n个月药材销量")
    @PostMapping("/recently")
    @ResponseBody
    public CommonResult<Map<String, Map<String, BigDecimal>>> recently(@RequestParam(value = "names", required = false) List<String> names,
                                                                       @RequestParam(value = "month", required = false) Integer month,
                                                                       @RequestParam(value = "type") String type) {
        Map<String, Map<String, BigDecimal>> result = salesService.recently(names, month, type);
        return CommonResult.success(result);
    }
}
