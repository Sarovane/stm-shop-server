package com.stronge.shop.common.enums;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 9:49 2021/3/17
 */
public enum SexEnum {
    WOMAN(0, "女"),
    MAN(1, "男"),
    SECRET(2, "保密");
    public final Integer type;
    public final String value;


    SexEnum(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
