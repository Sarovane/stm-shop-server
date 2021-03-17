package com.stronge.shop.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 9:11 2021/3/17
 */
@ApiModel(value = "用户对象BO",description = "从客户端由用户传入的数据封装")
public class UserBo {
    @ApiModelProperty(value ="用户名" ,name = "userName" ,required = true,example = "张三")
    private String username;
    @ApiModelProperty(value ="密码" ,name = "password" ,required = true)
    private String password;
    @ApiModelProperty(value ="确认密码" ,name = "confirmPassword" ,required = false)
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
