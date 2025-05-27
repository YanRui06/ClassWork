package com.Class.Study250522.classTest;

public class People extends Zoo{

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public People(String name) {
        this.name = name;
    }

    public People(String name, String name1) {
        super(name);
        this.name = name1;
    }

    @Override
    public void talk() {
        System.out.println("欢迎来到动物园");
        System.out.println("我是饲养员 "+this.getName());
    }

    public void feed(Animal animal,Food food){
        animal.eat(food);
    }
}
