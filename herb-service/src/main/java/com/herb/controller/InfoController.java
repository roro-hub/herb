package com.herb.controller;

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
@Api(tags = "InfoController", value = "基础信息")
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

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult<Void> delete(@PathVariable Long id) {
        infoService.delete(id);
        return CommonResult.success();
    }

    @ApiOperation("分页列表查询")
    @GetMapping("/get/{type}")
    @ResponseBody
    public CommonResult<Info> get(@PathVariable(value = "type") String type) {
        Info info = infoService.get(type);
        return CommonResult.success(info);
    }

    @ApiOperation("查询信息列表")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<List<Info>> list(@RequestParam(value = "types") List<String> types) {
        List<Info> infos = infoService.list(types);
        return CommonResult.success(infos);
    }
}
