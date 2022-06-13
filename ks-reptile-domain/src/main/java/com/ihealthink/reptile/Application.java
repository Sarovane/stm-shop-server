package com.ihealthink.reptile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 11:43 2021/1/15
 */

@SpringBootApplication
@MapperScan(basePackages = "com.ihealthink.reptile.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
