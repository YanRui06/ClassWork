package com.apiClass.Study250616.ClassWork;

public class Phone {

    private String gid;
    private String name;
    private String color;
    private double price;
    private int num;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Phone() {
    }

    public Phone(String gid, String name, String color, double price, int num) {
        this.gid = gid;
        this.name = name;
        this.color = color;
        this.price = price;
        this.num = num;
    }
}
