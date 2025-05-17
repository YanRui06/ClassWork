package com.Class.Study250515.ClassWork;

import java.util.ArrayList;
import java.util.Scanner;

public class bankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bank> banks = new ArrayList<>();
        Bank bank = new Bank("123456", 500.0);
        banks.add(bank);
        System.out.println("当前账户：" + bank.getBankName() + " 余额：" + bank.getLeftMoney());
        System.out.print("请输入要存入的金额：");
        int setmoney = sc.nextInt();
        if (bank.savemoney(setmoney)) {
            System.out.println("存款成功");
        } else {
            System.out.println("存款失败");
        }
        System.out.println("存入" + setmoney + "后，您的账户余额为：" + bank.getLeftMoney() + "元");
        System.out.print("请输入要取款的金额：");
        int getmoney = sc.nextInt();
        if (bank.getMoney(getmoney)) {
            System.out.println("取款成功");
        } else {
            System.out.println("取款失败");
        }
        System.out.println("取款" + getmoney + "后，您的账户余额为：" + bank.getLeftMoney());
    }
}
