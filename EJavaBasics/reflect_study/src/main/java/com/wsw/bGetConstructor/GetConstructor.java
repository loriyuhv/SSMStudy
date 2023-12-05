package com.wsw.bGetConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class GetConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1. 获取class字节码文件对象
        Class<?> clazz = Class.forName("com.wsw.bGetConstructor.Student");
        // 2. 获取构造方法

        // 1) 获取公共方法的
        // Constructor<?>[] constructors = clazz.getConstructors();
        // for (Constructor<?> constructor : constructors) {
        //     System.out.println(constructor);
        // }

        // 2) 获取所有类型的
        // Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        // for (Constructor<?> declaredConstructor : declaredConstructors) {
        //     System.out.println(declaredConstructor);
        // }

        // 3) 获取无参的构造方法
        // 方式一
        // Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        // System.out.println(declaredConstructor);
        // 方式二
        // Constructor<?> constructor = clazz.getConstructor();
        // System.out.println(constructor);
        // System.out.println(declaredConstructor.equals(constructor));

        // 4) 获取有一个参数的构造方法
        // 参数是引用数据类型
        // Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        // System.out.println(declaredConstructor);
        // 参数是基本数据类型
        // Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(int.class);
        // System.out.println(declaredConstructor);

        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
        // 获取权限修饰符号 public: 1 private: 2 protected: 4
        // int modifiers = declaredConstructor.getModifiers();
        // System.out.println(modifiers);

        // 获取构造方法参数个数
        // int parameterCount = declaredConstructor.getParameterCount();
        // System.out.println(parameterCount);

        // 获取构造方法参数类型
        // Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
        // System.out.println(Arrays.toString(parameterTypes));

        // 获取构造方法 所有参数
        // Parameter[] parameters = declaredConstructor.getParameters();
        // System.out.println(Arrays.toString(parameters));

        // 使用构造方法新建类
        // 表示临时取消权限校验
        // 暴力反射：
        declaredConstructor.setAccessible(true);
        Student jerry = (Student) declaredConstructor.newInstance("Jerry", 18);
        System.out.println(jerry);
        String string = jerry.toString();
        System.out.println(string);

    }
}
