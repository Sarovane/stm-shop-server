package com.stronge.shop.service.impl;

import com.stronge.shop.mapper.CarouselMapper;
import com.stronge.shop.pojo.Carousel;
import com.stronge.shop.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 17:35 2021/3/16
 */
@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Carousel getAllCarouse(String id) {
        Carousel carousel = carouselMapper.selectByPrimaryKey(id);
        return carousel;
    }
}
