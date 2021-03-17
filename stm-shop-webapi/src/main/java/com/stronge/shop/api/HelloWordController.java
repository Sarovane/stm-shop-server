package com.stronge.shop.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 11:46 2021/1/15
 */
@ApiIgnore
@RestController
public class HelloWordController {


    @GetMapping("/hello")
    public Object helloWord() {

        return "helloWord";
    }


}
