package com.herb.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginBO {

    @NotBlank
    @ApiModelProperty(value = "登录名")
    private String loginName;

    @NotBlank
    @ApiModelProperty(value = "密码")
    private String password;

}