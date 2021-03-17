package com.stronge.shop.service.impl;

import com.stronge.shop.common.enums.SexEnum;
import com.stronge.shop.common.utils.Md5Utils;
import com.stronge.shop.common.utils.date.DateUtil;
import com.stronge.shop.mapper.UsersMapper;
import com.stronge.shop.model.UserBo;
import com.stronge.shop.pojo.Users;
import com.stronge.shop.service.UsersService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.sql.SQLException;
import java.util.Date;

/**
 * @author Rocket
 * @version 1.0
 * @description: 用户操作
 * @date Created in 22:11 2021/3/16
 */
@Service
public class UsersServiceImpl implements UsersService {

    private final String FACE_IMG_URL="https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimage.biaobaiju.com%2Fuploads%2F20181223%2F21%2F1545570162-jcAzLkHKVu.jpg&refer=http%3A%2F%2Fimage.biaobaiju.com&app=2002&size=f9999," +
            "10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1618552304&t=4743444e8f344f8bd90d544d9741632d";
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private Sid sid;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor = SQLException.class)
    public Boolean getUserByUserName(String userName) {
        Example userExample = new Example(Users.class);
        Example.Criteria criteria = userExample.createCriteria();
        criteria.andEqualTo("userName", userName);
        Users resultUser = usersMapper.selectOneByExample(userExample);
        return resultUser == null;
    }

    @Override
    public Users createUser(UserBo userBo) {
        if(!userBo.getPassword().equals(userBo.getConfirmPassword())){
            throw new RuntimeException("the password is not same");
        }
        Users users = new Users();
        users.setUserName(userBo.getUsername());
        users.setPassword(Md5Utils.getMd5String(userBo.getPassword()));
        users.setNickName(userBo.getUsername());
        users.setBirthday(DateUtil.StringToDate("1990-01-01"));
        users.setSex(SexEnum.SECRET.type);
        users.setFace(FACE_IMG_URL);
        users.setCreatedTime(new Date());
        users.setUpdatedTime(new Date());
        users.setId(sid.nextShort());
        int insert = usersMapper.insert(users);
        return insert==1?users:null;
    }

    @Override
    public Users queryUserForLogin(UserBo userBo) {
        Example userExample = new Example(Users.class);
        Example.Criteria criteria = userExample.createCriteria();
        criteria.andEqualTo("userName", userBo.getUsername());
        criteria.andEqualTo("password", Md5Utils.getMd5String(userBo.getPassword()));
        Users users = usersMapper.selectOneByExample(userExample);

        return users;
    }
}
