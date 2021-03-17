package com.stronge.shop.api;

import com.stronge.shop.pojo.Carousel;
import com.stronge.shop.service.CarouselService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 17:40 2021/3/16
 */
@ApiIgnore
@RestController
public class CarouselController {
    final static Logger logger= LoggerFactory.getLogger(CarouselController.class);

    @Autowired
    private CarouselService carouselService;
    @ApiOperation(value = "注册用户信息", notes = "注册用户信息", httpMethod = "GET")
    @GetMapping(value = "/carousel/{id}")
    public Object getCarouselInfo(@PathVariable String id){
        Carousel result = carouselService.getAllCarouse(id);
        return result;
    }


}
