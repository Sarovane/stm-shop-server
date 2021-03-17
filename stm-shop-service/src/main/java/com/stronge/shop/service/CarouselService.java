package com.stronge.shop.service;

import com.stronge.shop.pojo.Carousel;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 17:34 2021/3/16
 */
public interface CarouselService {
    /**
     *根据id查询信息
     * @param id  id
     * @return 详细信息
     */
   Carousel getAllCarouse(String id);
}
