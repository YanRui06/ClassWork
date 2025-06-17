package com.apiClass.Study250616;

public class Member {
    private int id;
    private String name;
    private int age;
    private String garde;

    @Override
    public String toString() {
        return "详细信息{" +
                "成员编号：" + id +
                ", 姓名：'" + name + '\'' +
                ", 年龄：" + age +
                ", 年级：'" + garde + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGarde() {
        return garde;
    }

    public void setGarde(String garde) {
        this.garde = garde;
    }

    public Member() {
    }

    public Member(int id, String name, int age, String garde) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.garde = garde;
    }
}
