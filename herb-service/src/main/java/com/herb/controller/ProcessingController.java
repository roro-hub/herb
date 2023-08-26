package com.herb.controller;

import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.Processing;
import com.herb.service.ProcessingService;
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

    @ApiOperation("详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<Processing> get(@PathVariable Long id) {
        Processing processing = processingService.get(id);
        return CommonResult.success(processing);
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Processing>> list(@RequestParam(value = "name", required = false) String name,
                                                     @RequestParam(value = "type", required = false) String type,
                                                     @RequestParam(value = "herbId", required = false) Long herbId,
                                                     @RequestParam(value = "herbName", required = false) String herbName,
                                                     @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Processing> list = processingService.list(name, type, herbId, herbName, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
