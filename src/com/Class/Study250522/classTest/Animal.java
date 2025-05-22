package com.Class.Study250522.classTest;

public abstract class Animal extends Zoo{
    public Animal() {
    }

    public Animal(String name) {
        super(name);
    }

    public abstract void talk();

    public abstract void eat(Food food);

}
