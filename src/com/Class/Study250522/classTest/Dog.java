package com.Class.Study250522.classTest;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.print("汪汪汪～");
    }

    @Override
    public void eat(Food food) {
        System.out.println(getName()+"正在啃着香喷喷的"+food.getName());
    }

}
