package com.herb.controller;

import com.herb.common.api.CommonResult;
import com.herb.common.util.UploadFileUtils;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@Api(tags = "FileController", value = "文件管理")
@RequestMapping("/file")
public class FileController {

    @PostMapping(value = "/upload")
    @ResponseBody
    public CommonResult<String> upload(@RequestParam("file") MultipartFile files, HttpServletRequest request) {
        String dicName="UpFile";//服务器上传文件夹名称
        String newFileName = files.getOriginalFilename();
        newFileName = newFileName.substring(0, newFileName.lastIndexOf("."));
        String picUrl = UploadFileUtils.saveFile(files, newFileName, dicName, request);
        return CommonResult.success(picUrl);
    }
}
