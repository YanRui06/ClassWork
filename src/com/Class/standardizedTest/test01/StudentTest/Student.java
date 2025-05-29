package com.Class.standardizedTest.test01.StudentTest;

public class Student extends Person implements IterSwimming {
    public Student() {
    }

    public Student(String ID, String name, int age, String birth) {
        super(ID, name, age, birth);
    }

    @Override
    public void talk() {
        System.out.println("说中文和英文");
    }

    public void study() {
        System.out.println("我爱学习");
    }

    public void examination() {
        System.out.println("我爱考试");
    }

    @Override
    public void swim() {
        System.out.println("学生学习自由泳");
    }
}
