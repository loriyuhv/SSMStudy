package com.wsw.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
    /**
     * 定义一个切入点，用于匹配com.wsw.dao.impl包下的BookDaoImpl类中update方法
     * 匹配规则说明：execution(* com.wsw.dao.impl.BookDaoImpl.update())
     * => execution：表示匹配方法的执行
     * => *：方法的返回值类型，匹配任意返回类型
     * => com.wsw.dao.impl.BookDaoImpl.update：匹配com.wsw.dao.impl包下的BookDaoImpl类中update方法
     * => ()：匹配无参方法
     */
    // @Pointcut("execution(* com.wsw.dao.impl.BookDaoImpl.update())")

    /**
     * 方法列表中*和..的区别
     * (*)：一个或多个形式参数
     * (..)：零个或多个形式参数
     */
    // @Pointcut("execution(* com.wsw.dao.impl.BookDaoImpl.update(*))")
    // @Pointcut("execution(* com.wsw.dao.impl.BookDaoImpl.update(..))")

    /**
     * 体会*通配符
     */
    // @Pointcut("execution(* *.*.*.*.BookDaoImpl.update(..))")

    /**
     * 体会：*后面的..代表匹配任意0个或多个
     * 匹配com包的任意子包下的任意类或接口的update方法里的任意参数，返回值任意
     */
    // @Pointcut("execution(* com.*..update(..))")

    /**
     * 体会：匹配任意包下的任意方法里的任意参数，返回值任意类型
     */
    // @Pointcut("execution(* *..*(..))")

    /**
     * 体会：匹配任意包下的任意类或接口下的以u开头的方法
     */
    // @Pointcut("execution(* *..u*(..))")

    /**
     * 定义一个切入点，用于匹配任意包下的任意类或接口中以"e"结尾的方法
     * 匹配规则说明：execution(* *..*e(..))
     * => execution：表示匹配方法的执行
     * => *：方法的返回值类型，匹配任意返回类型
     * => *..*e：匹配任意包下的任意类或接口的方法，方法以“e”结尾
     * => (..)：匹配任意参数列表，包括有参方法和无参方法
     */
    // @Pointcut("execution(* *..*e(..))")

    /**
     * 定义一个切入点，用于匹配com.wsw下的任意包下的以Service结尾的任意类或接口中以“find”开头的方法
     * 匹配规则说明：execution(* com.wsw.*.*Service.find*(..))
     * => execution：表示匹配方法的执行
     * => *：方法的返回值类型，匹配任意返回类型
     * => com.wsw.*.*Service.find*：匹配com.wsw包下的任意包下的以Service结尾的任意类或接口中的方法，方法以“find”开头。
     * => (..)：匹配任意参数列表，包括有参方法和无参方法
     */
    @Pointcut("execution(* com.wsw.*.*Service.find*(..))")
    public void pt() {}

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
