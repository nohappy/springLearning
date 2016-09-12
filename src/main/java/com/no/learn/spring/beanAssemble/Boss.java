package com.no.learn.spring.beanAssemble;

import java.util.List;

/**
 * @author: suolongxiang  Date: 16/9/11 Time: 下午9:53
 */
public class Boss {

    private String bossName;
    private List<String> addresses;
    private Car car = new Car();
    private Car[] cars;

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}