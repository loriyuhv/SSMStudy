package com.wsw.aGetClassFile;

public class GetClassFile {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 获取Class对象的三种方式
         * 1. Class.forName("全类名");
         * 2. 类名.class
         * 3. 对象.class
         */
        // 1. Class.forName("全类名");
        // 最为常用
        Class<?> clazz01 = Class.forName("com.wsw.aGetClassFile.Student");
        System.out.println(clazz01);

        // 2. 类名.class
        // 一般更多的是当作参数进行传递
        Class<Student> clazz02 = Student.class;
        System.out.println(clazz02);

        // 3. 对象.class
        // 当我们已经有了这个类的对象时，才可以使用
        Student student = new Student();
        Class<? extends Student> clazz03 = student.getClass();
        System.out.println(clazz03);
        System.out.println(clazz01 == clazz02);
        System.out.println(clazz03 == clazz02);
    }
}
