package com.Class.Study250515.ClassWork;

public class Bank {
    private String bankName;
    private double leftMoney;

    public double getLeftMoney(){
        return leftMoney;
    }

    public boolean savemoney(double Money){
        if(Money < 0){
            return false;
        }else {
            leftMoney += Money;
            return true;
        }
    }

    public boolean getMoney(double Money){
        if(Money > leftMoney){
            return false;
        }else {
            leftMoney -= Money;
            return true;
        }
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public Bank() {
    }

    public Bank(String bankName, double leftMoney) {
        this.bankName = bankName;
        this.leftMoney = leftMoney;
    }
}
