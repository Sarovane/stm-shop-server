package com.stronge.shop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 18:01 2021/3/17
 */
@Aspect
@Configuration
public class ServiceLogAspect {
    /**
     * AOP通知：
     * 1。前置通知
     */


    public static final Logger logger = LoggerFactory.getLogger(ServiceLogAspect.class);

    public static final Integer OUT_TIME = 3000;
    public static final Integer LIMIT_TIME = 2000;

    /**
     * 切面表达式
     * execution 代表所要执行的表达式主题
     * * 代表返回类型，*本身代表所有
     * ..代表该包以及其子包下的所有类方法
     * * 代表类名，*代表所有类
     * *（。。） *表示任意方法名  。。表明任意参数
     */

    @Around("execution(* com.stronge.shop.service.impl..*.*(..))")
    public Object recordTimeLog(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("the method is start {}.{}",
                joinPoint.getTarget().getClass(), joinPoint.getSignature().getName());
        long beginTime = System.currentTimeMillis();
        //执行目标service
        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();

        long takeTime = endTime - beginTime;
        if (takeTime > OUT_TIME) {
            logger.error("the method is out time:{}", takeTime);
        } else if (takeTime <= OUT_TIME && takeTime > LIMIT_TIME) {
            logger.warn("the method is middle time :{}", takeTime);
        } else {
            logger.info("the method is very good:{}", takeTime);
        }
        return result;
    }


}
