package com.wsw.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description 通知类
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.wsw.service.*Service.*(..))")
    private void servicePt() {}

    @Around("servicePt()")
    public Object runSpeed(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();

        long startTime = System.currentTimeMillis();
        Object proceed = null;
        for (int i = 0; i < 10000; i++) {
            proceed = joinPoint.proceed();
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("万次执行：" + className + "." + methodName + "===>" + duration + "ms");
        return proceed;
    }
}
