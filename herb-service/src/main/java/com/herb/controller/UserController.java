package com.herb.controller;

import com.herb.common.api.CommonResult;
import com.herb.bo.LoginBO;
import com.herb.mbg.model.User;
import com.herb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "UserController", value = "用户信息")
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("登录")
    @PostMapping("/login")
    @ResponseBody
    public CommonResult<User> login(@RequestBody LoginBO bo) {
        User user = userService.login(bo);
        return CommonResult.success(user);
    }

}
