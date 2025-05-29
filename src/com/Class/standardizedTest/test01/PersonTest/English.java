package com.Class.standardizedTest.test01.PersonTest;

public class English extends Person {
    public English() {
    }

    public English(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void eat() {
        System.out.println("我是英国人，我喜欢吃三明治!");
    }

    public void horseRiding(){
        System.out.println(this.getName()+"在练习骑马！");
    }
}
