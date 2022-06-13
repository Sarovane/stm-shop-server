package com.ihealthink.reptile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 13:32 2021/3/17
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo()).
                select().apis(RequestHandlerSelectors.
                //指定controller包
                basePackage("com.ihealthink.reptile.api"))
                // 选择器选择此包下的所用controller
                .paths(PathSelectors.any())
                .build();
    }
    //swagger2 所需对象
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("种子工程 API")
                .description("种子工程项目搭建")
                .version("1.0.0")
                .build();

    }

}
