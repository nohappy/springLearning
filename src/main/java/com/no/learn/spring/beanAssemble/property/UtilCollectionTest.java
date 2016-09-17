package com.no.learn.spring.beanAssemble.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: suolongxiang  Date: 16/9/17 Time: 下午4:28
 */
public class UtilCollectionTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/beans-util.xml");
        List<String> list = (List<String>)ctx.getBean("productNames");
        Set<Double> set = (Set<Double>)ctx.getBean("productSet");
        Map<String, Integer> map = (Map<String, Integer>)ctx.getBean("productMap");

        System.err.println("1212");
    }
}