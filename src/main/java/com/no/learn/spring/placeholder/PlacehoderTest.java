package com.no.learn.spring.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: suolongxiang  Date: 16/9/24 Time: 下午5:43
 */
public class PlacehoderTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-placeholder.xml");

        JdbcConfig jdbcConfig = (JdbcConfig)ctx.getBean("jdbcConfig");
        System.err.println();
    }
}