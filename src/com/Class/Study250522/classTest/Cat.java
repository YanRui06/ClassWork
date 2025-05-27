package com.Class.Study250522.classTest;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void talk() {
        System.out.print("喵喵喵～");
    }

    @Override
    public void eat(Food food) {
        System.out.println(getName()+"正在吃香喷喷的"+food.getName());
    }
}
