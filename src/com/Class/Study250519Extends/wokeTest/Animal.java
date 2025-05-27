package com.Class.Study250519Extends.wokeTest;

public class Animal {
   private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal(String type) {
        this.type = type;
    }

    public Animal() {
    }

    public void walk()
    {
        System.out.println("Animal is walking");
    }
    public void eat(){

    }
}
