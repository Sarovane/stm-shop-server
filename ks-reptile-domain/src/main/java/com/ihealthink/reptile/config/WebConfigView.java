package com.ihealthink.reptile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 19:39 2021/3/17
 */
@Configuration
public class WebConfigView implements WebMvcConfigurer {
    /**
     * 试图跳转功能
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/doc.html");
        //registry.addRedirectViewController("/","/swagger-ui.html");
    }

    /**
     * 跨域配置
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*");
    }


}
