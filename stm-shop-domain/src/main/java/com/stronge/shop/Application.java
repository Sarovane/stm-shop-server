package com.stronge.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 11:43 2021/1/15
 */

@SpringBootApplication
@MapperScan(basePackages = "com.stronge.shop.mapper")
@ComponentScan(basePackages = {"com.stronge.shop" , "org.n3r.idworker"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
