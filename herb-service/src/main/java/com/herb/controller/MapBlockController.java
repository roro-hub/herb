package com.herb.controller;

import com.herb.common.api.CommonPage;
import com.herb.common.api.CommonResult;
import com.herb.mbg.model.MapBlock;
import com.herb.service.MapBlockService;
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
@Api(tags = "MapBlockController", value = "地图区块信息")
@RequestMapping("/mapBlock")
public class MapBlockController {

    @Resource
    private MapBlockService mapBlockService;

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody MapBlock mapBlock) {
        mapBlockService.add(mapBlock);
        return CommonResult.success();
    }

    @ApiOperation("编辑")
    @PutMapping
    @ResponseBody
    public CommonResult<Void> update(@RequestBody MapBlock mapBlock) {
        mapBlockService.update(mapBlock);
        return CommonResult.success();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult<Void> delete(@PathVariable Long id) {
        mapBlockService.delete(id);
        return CommonResult.success();
    }

    @ApiOperation("详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<MapBlock> get(@PathVariable Long id) {
        MapBlock mapBlock = mapBlockService.get(id);
        return CommonResult.success(mapBlock);
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<MapBlock>> list(@RequestParam(value = "name", required = false) String name,
                                                   @RequestParam(value = "type") String type,
                                                   @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<MapBlock> list = mapBlockService.list(name, type, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
