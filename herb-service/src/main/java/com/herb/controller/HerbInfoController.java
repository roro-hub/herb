package com.herb.controller;

import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.HerbInfo;
import com.herb.service.HerbInfoService;
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
@Api(tags = "HerbInfoController", value = "药草信息")
@RequestMapping("/herbInfo")
public class HerbInfoController {

    @Resource
    private HerbInfoService herbInfoService;

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody HerbInfo herbInfo) {
        herbInfoService.add(herbInfo);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody HerbInfo herbInfo) {
        herbInfoService.update(herbInfo);
        return CommonResult.success();
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<HerbInfo>> list(@ApiParam("类型") @RequestParam(value = "type") String type,
                                                   @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<HerbInfo> list = herbInfoService.list(type, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
