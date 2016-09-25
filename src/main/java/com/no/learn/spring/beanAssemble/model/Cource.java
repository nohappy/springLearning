package com.no.learn.spring.beanAssemble.model;

/**
 * @author: suolongxiang  Date: 16/9/11 Time: 下午3:50
 */
public class Cource {

    private String courceName;
    private Teacher teacher;

    public Cource() {
    }

    public Cource(String courceName, Teacher teacher) {
        this.courceName = courceName;
        this.teacher = teacher;
    }

    public String getCourceName() {
        return courceName;
    }

    public void setCourceName(String courceName) {
        this.courceName = courceName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}