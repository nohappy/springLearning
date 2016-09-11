package com.no.learn.spring.beanAssemble.constructor;

import com.no.learn.spring.beanAssemble.Cource;
import com.no.learn.spring.beanAssemble.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: suolongxiang  Date: 16/9/11 Time: 下午3:52
 */
public class ContructorTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/beans-ssemble.xml");

        Cource cource = (Cource)ctx.getBean("cource");
        Cource cource1 = (Cource)ctx.getBean("cource1");

        Teacher teacher = (Teacher)ctx.getBean("teacher");
        System.err.println("12");
    }
}