package com.stronge.shop.api;

import com.stronge.shop.common.utils.HttpJsonResult;
import com.stronge.shop.model.UserBo;
import com.stronge.shop.pojo.Users;
import com.stronge.shop.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 17:40 2021/3/16
 */

@Api(value = "注册登录", tags = {"用于注册登录"})
@RestController
@RequestMapping("/passport")
public class PassportController {
    final static Logger logger= LoggerFactory.getLogger(PassportController.class);

    @Autowired
    private UsersService usersService;

    @ApiOperation(value = "用户名是否存在", notes = "用户是否存在", httpMethod = "GET")
    @GetMapping(value = "/user/{userName}")
    public ResponseEntity<Boolean> getCarouselInfo(@PathVariable String userName) {
        Boolean result = usersService.getUserByUserName(userName);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @ApiOperation(value = "注册用户信息", notes = "注册用户信息", httpMethod = "POST")
    @PostMapping(value = "/register")
    public ResponseEntity<Users> getCarouselInfo(@RequestBody UserBo userBo) {
        Users result = usersService.createUser(userBo);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST")
    @PostMapping(value = "/login")
    public HttpJsonResult queryUserForLogin(@RequestBody UserBo userBo) {
        Users result = usersService.queryUserForLogin(userBo);
        return HttpJsonResult.ok(result);
    }

}
