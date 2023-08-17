package com.herb.controller;

import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Info;
import com.herb.service.InfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "InfoController", value = "信息管理")
@RequestMapping("/info")
public class InfoController {

    @Resource
    private InfoService infoService;

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody Info info) {
        infoService.add(info);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody Info info) {
        infoService.update(info);
        return CommonResult.success();
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Info>> list(@RequestParam(value = "type") String type,
                                               @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Info> list = infoService.list(type, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
