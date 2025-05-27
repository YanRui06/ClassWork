package com.Class.Study250519Extends.wokeTest;

public class Goat extends Animal {
    public Goat(String type) {
        super(type);
    }

    @Override
    public void eat() {
        System.out.println("Goat eat");
    }
}
