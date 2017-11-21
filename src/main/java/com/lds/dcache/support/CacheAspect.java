package com.lds.dcache.support;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class CacheAspect {

    @Pointcut("execution(* com.lds.dcache.support.*.*(..))")
    public void choseSdb(){}

    @Before("choseSdb()")
    public void beforechoseSdb(JoinPoint point){
        Object object = point.getTarget();
        //获取方发名
        String modthName = point.getSignature().getName();
        Class<?>[] parameterTypes = ((MethodSignature)(point.getSignature())).getMethod().getParameterTypes();
        try {
            Method method = object.getClass().getMethod(modthName,parameterTypes);
            CacheExConfig config = method.getAnnotation(CacheExConfig.class);
            config.cacheNames();
            config.cachetype();
            config.expire();
            config.region();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
