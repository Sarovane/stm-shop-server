package com.stronge.shop.service;

import com.stronge.shop.model.UserBo;
import com.stronge.shop.pojo.Carousel;
import com.stronge.shop.pojo.Users;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 17:34 2021/3/16
 */
public interface UsersService {
    /**
     *判断用户名是否存在
     * @param userName  用户名
     * @return 用户信息
     */
   Boolean getUserByUserName(String userName);
    /**
     * 创建用户
     * @param userBo
     * @return 用户信息
     */
    Users createUser(UserBo userBo);
    /**
     * 登录用户
     * @param userBo 用户名
     * @return 用户信息
     */
    Users queryUserForLogin(UserBo userBo);

}
