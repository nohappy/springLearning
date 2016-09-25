package com.no.learn.spring.beanAssemble.relation;

import com.no.learn.spring.beanAssemble.model.Leader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: suolongxiang  Date: 16/9/17 Time: 下午7:45
 */
public class RelationTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/beans-relation.xml");

        Leader leader = (Leader)ctx.getBean("leader");

        Leader l2 = (Leader)ctx.getBean("leader2");
        System.err.println();
    }
}