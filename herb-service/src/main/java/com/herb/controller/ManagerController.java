package com.herb.controller;

import com.herb.bo.ProductBO;
import com.herb.mbg.api.CommonPage;
import com.herb.mbg.api.CommonResult;
import com.herb.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "ManagerController", description = "产品接口")
@RequestMapping("/product")
public class ManagerController {

    @Resource
    private ProductService productService;

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody Product product) {
        productService.add(product);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@Validated(ProductBO.Update.class) @RequestBody ProductBO bo) {
        productService.update(bo);
        return CommonResult.success();
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Product>> list(@ApiParam("产品名称") @RequestParam(value = "name") String name,
                                                  @ApiParam("产品类型") @RequestParam(value = "type") Integer type,
                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Product> list = productService.list(name, type, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
