package com.wsw.aop;

import org.aspectj.lang.ProceedingJoinPoint;
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
    @Pointcut("execution(boolean com.wsw.service.*Service.openURL(..))")
    private void servicePt() {}

    @Around("servicePt()")
    public Object trimString(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            // 判断参数是不是字符串
            if (args[i] instanceof String) {
                System.out.println(((String) args[i]).length());
                args[i] = args[i].toString().trim();
                System.out.println(args[i]);
            }
        }
        return pjp.proceed(args);
    }

}
