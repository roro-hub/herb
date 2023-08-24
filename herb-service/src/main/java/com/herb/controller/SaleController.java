package com.herb.controller;

import com.herb.bo.SaleBO;
import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Sale;
import com.herb.service.SaleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "SaleController", value = "药材销量")
@RequestMapping("/sale")
public class SaleController {

    @Resource
    private SaleService saleService;
    
    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody Sale sale) {
        saleService.add(sale);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody Sale sale) {
        saleService.update(sale);
        return CommonResult.success();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult<Void> delete(@PathVariable Long id) {
        saleService.delete(id);
        return CommonResult.success();
    }

    @ApiOperation("详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<Sale> get(@PathVariable Long id) {
        Sale sale = saleService.get(id);
        return CommonResult.success(sale);
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Sale>> list(@ApiParam("药材名称") @RequestParam(value = "name", required = false) String name,
                                               @RequestParam(value = "recordMonth", required = false) String recordMonth,
                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                               @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize) {
        List<Sale> list = saleService.list(name, recordMonth, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }
    
    @ApiOperation("销量图表")
    @PostMapping("/charts")
    @ResponseBody
    public CommonResult<List<SaleBO>> charts(@RequestParam(value = "names", required = false) List<String> names) {
        List<SaleBO> list = saleService.charts(names);
        return CommonResult.success(list);
    }
}
