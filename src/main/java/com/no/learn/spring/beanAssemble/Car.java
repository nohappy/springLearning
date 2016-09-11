package com.no.learn.spring.beanAssemble;

/**
 * @author: suolongxiang  Date: 16/9/11 Time: 下午1:57
 */
public class Car {

    private String brand;
    private int maxSpeed;
    private double price;
    private String comment;

    public Car() {

    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, String comment, int maxSpeed) {
        this.brand = brand;
        this.comment = comment;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, String comment, double price) {
        this.brand = brand;
        this.comment = comment;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}