package com.stronge.shop.test;


import com.stronge.shop.Application;
import com.stronge.shop.pojo.Carousel;
import com.stronge.shop.service.CarouselService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 19:17 2021/3/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class CarouseServiceTest {

    @Autowired
    private CarouselService carouselService;
    @Autowired

    @Test
   public void myTest(){
        Carousel allCarouse = carouselService.getAllCarouse("12345");
        Assert.isNull(allCarouse,"it is not null");

    }


}
