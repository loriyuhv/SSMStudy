package com.wsw.service.impl;

import com.wsw.config.SpringConfig;
import com.wsw.pojo.Student;
import com.wsw.service.StudentService;
import junit.framework.TestCase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentServiceImplTest extends TestCase {


    public void testSelectById(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentService studentService = ctx.getBean(StudentService.class);
        Student student = studentService.selectById(1);
        System.out.println(student);
    }

    public void testAdd() {
        Student student = new Student();
        student.setStuName("江明东");
        student.setStuAge(18);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentService bean = ctx.getBean(StudentService.class);
        Integer count = bean.add(student);
        System.out.println(count);
    }

}