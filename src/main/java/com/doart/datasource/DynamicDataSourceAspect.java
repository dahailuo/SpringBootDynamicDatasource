package com.doart.datasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Slf4j
@Aspect
@Component
public class DynamicDataSourceAspect implements Ordered {

    @Override
    public int getOrder() {

        return 1;
    }

    @Pointcut("@annotation(com.doart.datasource.DynamicDataSource)")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {

        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        DynamicDataSource ds = method.getAnnotation(DynamicDataSource.class);
        if (ds == null) {

            DynamicRoutingDataSource.setDataSource(DynamicDataSourceNames.CJ);
        } else {

            DynamicRoutingDataSource.setDataSource(ds.name());
        }
        try {

            return point.proceed();
        } finally {

            DynamicRoutingDataSource.clearDataSource();
        }
    }
}
