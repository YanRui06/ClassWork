package com.Class.standardizedTest.test01.StudentTest;

public class Person {
    private String ID;
    private String name;
    private int age;
    private String birth;


    public void talk(){
        System.out.println("说话");
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Person() {
    }

    public Person(String ID, String name, int age, String birth) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.birth = birth;
    }
}
