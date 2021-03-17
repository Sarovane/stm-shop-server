package com.stronge.shop.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Category {

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 类型
     */
    @Column(name = "type")
    private Integer type;

    /**
     * 父级id
     */
    @Column(name = "father_id")
    private Integer fatherId;

    /**
     * logo
     */
    @Column(name = "logo")
    private String logo;

    /**
     * 口号
     */
    @Column(name = "slogan")
    private String slogan;

    /**
     * 分类图
     */
    @Column(name = "cat_image")
    private String catImage;

    /**
     * 背景颜色
     */
    @Column(name = "bg_color")
    private String bgColor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getCatImage() {
        return catImage;
    }

    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}