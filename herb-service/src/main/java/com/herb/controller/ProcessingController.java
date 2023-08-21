package com.herb.controller;

import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Processing;
import com.herb.service.ProcessingService;
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
@Api(tags = "processingController", value = "加工信息")
@RequestMapping("/processing")
public class ProcessingController {

    @Resource
    private ProcessingService processingService;

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody Processing processing) {
        processingService.add(processing);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody Processing processing) {
        processingService.update(processing);
        return CommonResult.success();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult<Void> delete(@PathVariable Long id) {
        processingService.delete(id);
        return CommonResult.success();
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Processing>> list(@ApiParam("药草") @RequestParam(value = "herbId") Long herbId,
                                                     @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Processing> list = processingService.list(herbId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
