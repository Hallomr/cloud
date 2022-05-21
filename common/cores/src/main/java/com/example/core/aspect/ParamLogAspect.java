package com.example.core.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ParamLogAspect {
    @Pointcut("@annotation(com.example.core.anno.ParamLogAnno)")
    public void log(){};

    @Around("log()")
    public Object logAround(ProceedingJoinPoint point){
        String name = point.getSignature().getName();
        Object[] args = point.getArgs();
        log.info("methodName:{},parameter:{}",name,args);
        try {
            Object proceed = point.proceed();
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
