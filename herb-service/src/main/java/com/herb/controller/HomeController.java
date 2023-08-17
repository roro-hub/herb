package com.herb.controller;

import com.herb.mbg.api.CommonResult;
import com.herb.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "LoginController", description = "登录")
@RequestMapping("/alarm")
public class HomeController {

    @Resource
    private HomeService homeService;

    @ApiOperation("用户告警数")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Long> count(@RequestParam(value = "userId") Long userId) {
        Long count = homeService.count(userId);
        return CommonResult.success(count);
    }

}
