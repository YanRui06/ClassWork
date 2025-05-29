package com.Class.standardizedTest.test01.StudentTest;

public class Teacher extends Person implements IterSwimming{
    public Teacher() {
    }

    public Teacher(String ID, String name, int age, String birth) {
        super(ID, name, age, birth);
    }

    @Override
    public void talk() {
        System.out.println("说中文、英文和德语");
    }
    public void teach() {
        System.out.println("我爱教书");
    }
    public void research(){
        System.out.println("我爱科研");
    }

    @Override
    public void swim() {
        System.out.println("教师学习蛙泳");
    }
}
