package com.Class.Study250519Extends.classTest;

public class Car extends Vehicle {
    public Car(String name, int numOfWheels, String color, int speed) {
        super(name, numOfWheels, color, speed);
    }

    @Override
    public void run() {
        System.out.println(super.getNumOfWheels() + "个轮子的" +
                super.getColor() + super.getName() + "正在路上以" +
                super.getSpeed() + "km/h的速度行驶，能源来源为燃油燃烧");
    }

    public void addGasolinr() {
        System.out.println(super.getName() + "正在加油...");
    }
}
