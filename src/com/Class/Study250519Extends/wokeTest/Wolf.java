package com.Class.Study250519Extends.wokeTest;

public class Wolf extends Animal {
    public Wolf(String type) {
        super(type);
    }

    @Override
    public void eat() {
        System.out.println("Wolf eats Goat");
    }
}
