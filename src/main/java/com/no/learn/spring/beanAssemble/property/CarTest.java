package com.no.learn.spring.beanAssemble.property;

import com.no.learn.spring.beanAssemble.Boss;
import com.no.learn.spring.beanAssemble.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: suolongxiang  Date: 16/9/11 Time: 下午2:05
 */
public class CarTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/beans-ssemble.xml");
        Car car = (Car)ctx.getBean("car");

        Car car1 = (Car)ctx.getBean("car1");

        Car car2 = (Car)ctx.getBean("car2");

        Car car3 = (Car)ctx.getBean("car3");

        Car car4 = (Car)ctx.getBean("car4");

        Boss boss = (Boss)ctx.getBean("boss");

        Boss boss2 = (Boss)ctx.getBean("boss2");

        Boss boss3 = (Boss)ctx.getBean("boss3");

        Boss boss4 = (Boss)ctx.getBean("boss4");
        System.err.println("121");
    }
}