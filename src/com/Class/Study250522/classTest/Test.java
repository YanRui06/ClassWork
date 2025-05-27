package com.Class.Study250522.classTest;

public class Test {
    public static void main(String[] args) {
        People p = new People("小华");
        p.talk();
        Dog dog = new Dog("小狗");
        dog.talk();
        Food food = new Bone();
        p.feed(dog,food);
        Cat cat = new Cat("小猫");
        cat.talk();
        food = new Fish("黄花鱼");
        p.feed(cat,food);

    }
}
