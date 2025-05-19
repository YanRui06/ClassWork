package com.Class.Study250519Extends.classTest;

public class Vehicle {
    private String name;
    private int numOfWheels;
    private String color;
    private int speed;

    public void run() {
        System.out.println(numOfWheels + "个轮子的" + color + name +
                "正在路上以" + speed + "km/h的速度行驶");
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println("正在加速，当前速度: " + speed + " km/h");
    }

    public void decelerate(int decrease) {
        speed -= decrease;
        System.out.println("正在减速，当前速度：" + speed + "km/h");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Vehicle(String name, int numOfWheels, String color, int speed) {
        this.name = name;
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.speed = speed;
    }

    public Vehicle() {
    }
}
