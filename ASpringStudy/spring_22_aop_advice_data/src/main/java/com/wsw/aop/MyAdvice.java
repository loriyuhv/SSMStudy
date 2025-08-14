package com.wsw.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description 通知类
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.wsw.dao.BookDao.*(..))")
    private void pt() {}

    // @Before("pt()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

    // @After("pt()")
    public void after(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

    // @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 100;
        return pjp.proceed(args);
    }

    // @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(JoinPoint jp, Object ret) {
        System.out.println("afterReturning advice ... " + ret);
    }

    @AfterThrowing(value = "pt()", throwing = "t")
    public void afterThrowing(Throwable t) {

        System.out.println("afterThrowing  advice ... " + t);
    }
}
