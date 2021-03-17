package com.stronge.shop.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Users {
    /**
     * 主键id 用户id
     */
    @Id
    private String id;

    /**
     * 用户名 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 昵称 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 真实姓名 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 头像 头像
     */
    private String face;

    /**
     * 手机号 手机号
     */
    private String mobile;

    /**
     * 邮箱地址 邮箱地址
     */
    private String email;

    /**
     * 性别 性别 1:男  0:女  2:保密
     */
    private Integer sex;

    /**
     * 生日 生日
     */
    private Date birthday;

    /**
     * 创建时间 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取主键id 用户id
     *
     * @return id - 主键id 用户id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id 用户id
     *
     * @param id 主键id 用户id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户名 用户名
     *
     * @return user_name - 用户名 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名 用户名
     *
     * @param userName 用户名 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码 密码
     *
     * @return password - 密码 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码 密码
     *
     * @param password 密码 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称 昵称
     *
     * @return nick_name - 昵称 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称 昵称
     *
     * @param nickName 昵称 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取真实姓名 真实姓名
     *
     * @return real_name - 真实姓名 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名 真实姓名
     *
     * @param realName 真实姓名 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取头像 头像
     *
     * @return face - 头像 头像
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置头像 头像
     *
     * @param face 头像 头像
     */
    public void setFace(String face) {
        this.face = face;
    }

    /**
     * 获取手机号 手机号
     *
     * @return mobile - 手机号 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号 手机号
     *
     * @param mobile 手机号 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取邮箱地址 邮箱地址
     *
     * @return email - 邮箱地址 邮箱地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱地址 邮箱地址
     *
     * @param email 邮箱地址 邮箱地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取性别 性别 1:男  0:女  2:保密
     *
     * @return sex - 性别 性别 1:男  0:女  2:保密
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别 性别 1:男  0:女  2:保密
     *
     * @param sex 性别 性别 1:男  0:女  2:保密
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取生日 生日
     *
     * @return birthday - 生日 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日 生日
     *
     * @param birthday 生日 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取创建时间 创建时间
     *
     * @return created_time - 创建时间 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间 创建时间
     *
     * @param createdTime 创建时间 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间 更新时间
     *
     * @return updated_time - 更新时间 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间 更新时间
     *
     * @param updatedTime 更新时间 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}