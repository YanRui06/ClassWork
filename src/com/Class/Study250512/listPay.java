package com.Class.Study250512;

public class listPay {
    private String name;
    private double money;
    private int num;
    private double list;
    private double all;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getList() {
        return list;
    }

    public void setList(double list) {
        this.list = list;
    }

    public double getAll() {
        return all;
    }

    public void setAll(double all) {
        this.all = all;
    }

    public listPay(String name, double money, int num, double list, int all) {
        this.name = name;
        this.money = money;
        this.num = num;
        this.list = list;
        this.all = all;
    }

    public listPay() {
    }
}
