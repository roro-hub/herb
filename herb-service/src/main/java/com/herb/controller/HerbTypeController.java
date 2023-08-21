package com.herb.controller;

import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.HerbType;
import com.herb.service.HerbTypeService;
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
@Api(tags = "HerbTypeController", value = "药草类型信息")
@RequestMapping("/herbType")
public class HerbTypeController {

    @Resource
    private HerbTypeService herbTypeService;

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody HerbType herb) {
        herbTypeService.add(herb);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody HerbType herb) {
        herbTypeService.update(herb);
        return CommonResult.success();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult<Void> delete(@PathVariable Long id) {
        herbTypeService.delete(id);
        return CommonResult.success();
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<HerbType>> list(@ApiParam("名称") @RequestParam(value = "name") String name,
                                                   @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<HerbType> list = herbTypeService.list(name, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
