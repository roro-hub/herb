package com.herb.controller;

import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Manager;
import com.herb.service.ManagerService;
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
@Api(tags = "ManagerController", value = "管理员信息")
@RequestMapping("/manager")
public class ManagerController {

    @Resource
    private ManagerService managerService;

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody Manager manager) {
        managerService.add(manager);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody Manager manager) {
        managerService.update(manager);
        return CommonResult.success();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult<Void> delete(@PathVariable Long id) {
        managerService.delete(id);
        return CommonResult.success();
    }

    @ApiOperation("详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<Manager> get(@PathVariable Long id) {
        Manager manager = managerService.get(id);
        return CommonResult.success(manager);
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Manager>> list(@ApiParam("管理员名称") @RequestParam(value = "name", required = false) String name,
                                                  @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Manager> list = managerService.list(name, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
