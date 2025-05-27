package com.Class.Study250424;

import java.util.Scanner;

public class classTest04 {
    public static void main(String[] args) {
        int money = 20;
        int book = 12;
        int pen = 1;
        int eraser = 2;
        int cola = 3;
        int food = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("书本的价格为12元，您共有20元");
        System.out.println("1,铅笔的价格为：" + pen + "元");
        System.out.println("2,橡皮的价格为：" + eraser + "元");
        System.out.println("3,可乐的价格为：" + cola + "元");
        System.out.println("4,零食的价格为：" + food + "元");
        System.out.println("请输入其他需要购买商品的序列号：");

        money = money - book;

        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("购买书本后还可以购买铅笔" + money / pen + "个，还剩" + 0 + "元");
                break;
            case 2:
                System.out.println("购买书本后还可以购买橡皮" + money / eraser + "个，还剩" + 0 + "元");
                break;
            case 3:
                System.out.println("购买书本后还可以购买可乐" + money / cola + "个，还剩" + 2 + "元");
                break;
            case 4:
                System.out.println("购买书本后还可以购买零食" + money / food + "个，还剩" + 3 + "元");
                break;
        }


    }
}
