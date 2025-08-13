package com.wsw.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description 通知类
 */
// 步骤六：定义通知类受Spring容器管理，并定义当前类为切面类
// 1. 让Spring IoC容器管理此类
@Component
// 2. 向Spring声明此类用于实现 AOP 功能
@Aspect
// 步骤三：定义通知类，制作通知
public class MyAdvice {
    // 步骤四：定义切入点
    // 3. 定义切入点（切入点）
    @Pointcut("execution(void com.wsw.dao.BookDao.update())")
    private void pt(){}
    // 步骤五：绑定切入点与通知关系，并指定通知添加到原始连接点的具体执行位置
    // 5. 绑定切入点与通知（创建切面）
    @Before("pt()")
    // 4. 定义通知（前置通知）
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
