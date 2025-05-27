package com.Class.Study250526;

public class classTest01 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.speek();
        Animal animal1 = new Animal();

        Dog dog = new Dog();
        dog = (Dog)animal;
        dog.eat();
        dog.speek();
        System.out.println(animal1 instanceof Dog)
        ;
    }

}
