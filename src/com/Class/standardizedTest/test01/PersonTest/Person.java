package com.Class.standardizedTest.test01.PersonTest;

public abstract class Person {
    private String name;
    private String sex;
    private int age;

    public abstract void eat();
    public void show(){
        System.out.println("姓名："+this.name+"，性别："+this.sex+"，年龄："+this.age);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
