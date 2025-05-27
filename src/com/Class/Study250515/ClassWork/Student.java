package com.Class.Study250515.ClassWork;

public class Student {
    private String sno;
    private String name;
    private int age;

    public String toString() {
        return name + "\t" + sno + "\t" + age;
    }

    public void addAge() {
        this.age += 1;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
