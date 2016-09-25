package com.no.learn.spring.beanAssemble.model;

/**
 * @author: suolongxiang  Date: 16/9/11 Time: 下午3:50
 */
public class Teacher {

    private String teacherName;
    private Cource cource;

    public Teacher() {

    }

    public Teacher(String teacherName, Cource cource) {
        this.teacherName = teacherName;
        this.cource = cource;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Cource getCource() {
        return cource;
    }

    public void setCource(Cource cource) {
        this.cource = cource;
    }
}