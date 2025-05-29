package com.Class.standardizedTest.test01.PersonTest;

public class Chinese extends Person {
    @Override
    public void eat() {
        System.out.println("我是中国人，我喜欢吃饭!");
    }
    public void shadowBoxing() {
        System.out.println(this.getName()+"在练习太极拳!");
    }

    public Chinese() {
    }

    public Chinese(String name, String sex, int age) {
        super(name, sex, age);
    }
}
