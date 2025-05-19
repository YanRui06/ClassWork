package com.Class.Study250519Extends.classTest;

public class Bicycle extends Vehicle {
    public Bicycle(String name, int numOfWheels, String color, int speed) {
        super(name, numOfWheels, color, speed);
    }

    @Override
    public void run() {
        System.out.println(super.getNumOfWheels() + "个轮子的" +
                super.getColor() + super.getName() + "正在路上以" +
                super.getSpeed() + "km/h的速度行驶，能源来源为踩踏脚蹬");
    }
}
