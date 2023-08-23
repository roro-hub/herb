package com.herb.controller;

import com.herb.common.api.CommonResult;
import com.herb.dto.MinioUploadDto;
import com.herb.service.MinioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * MinIO对象存储管理Controller
 * Created by macro on 2019/12/25.
 */
@Api(tags = "MinioController", value = "MinIO对象存储管理")
@Controller
@RequestMapping("/minio")
public class MinioController {

    @Resource
    private MinioService minioService;

    @ApiOperation("文件上传")
    @PostMapping("/upload")
    @ResponseBody
    public CommonResult<MinioUploadDto> upload(@RequestParam("file") MultipartFile file) {
        MinioUploadDto dto = minioService.upload(file);
        return CommonResult.success(dto);
    }

    @ApiOperation("文件删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Void> delete(@RequestParam("objectName") String objectName) {
        minioService.delete(objectName);
        return CommonResult.success();
    }
}
