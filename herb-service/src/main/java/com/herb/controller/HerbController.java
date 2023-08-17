package com.herb.controller;

import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Herb;
import com.herb.service.HerbService;
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
@Api(tags = "HerbController", value = "药草信息")
@RequestMapping("/herb")
public class HerbController {

    @Resource
    private HerbService herbService;

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody Herb herb) {
        herbService.add(herb);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody Herb herb) {
        herbService.update(herb);
        return CommonResult.success();
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Herb>> list(@ApiParam("名称") @RequestParam(value = "name") String name,
                                               @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Herb> list = herbService.list(name, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
