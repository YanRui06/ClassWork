package com.Class.Study250519Extends.classTest;

public class Test {
    public static void main(String[] args) {
        System.out.println("Make a bicycle");
        Bicycle b = new Bicycle("bicycle",2,"black",15);
        b.run();
        b.accelerate(3);
        b.decelerate(2);
        System.out.println("Make a ElectricBicycle");
        ElectricBicycle eb = new ElectricBicycle("electricBicycle", 2, "blye", 35);
        eb.charge();
        eb.run();
        eb.accelerate(3);
        eb.decelerate(1);
        System.out.println("Make a car");
        Car car = new Car("Car",4,"pink",15);
        car.run();
        car.accelerate(6);
        car.decelerate(2);
    }
}
