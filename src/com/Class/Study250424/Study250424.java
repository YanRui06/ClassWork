package com.Class.Study250424;

import java.util.Scanner;

public class Study250424 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int points = 10;
        boolean Exchange = true;
        while (Exchange) {
            System.out.println("-----------积分兑换小程序-----------");
            System.out.println("1，铅笔所需积分为：1");
            System.out.println("2，橡皮所需积分为：2");
            System.out.println("3，作业本所需积分为：3");
            System.out.println("4，文具盒所需积分为：5");
            System.out.print("请输入需要兑换的物品编号：");
            int num1 = sc.nextInt();
            points = switch (num1) {
                case 1 -> points - 1;
                case 2 -> points - 2;
                case 3 -> points - 3;
                case 4 -> points - 5;
                default -> {
                    System.out.println("非法输入");
                    yield points;
                }
            };
            System.out.println("你还剩余" + points + "积分");
            if(points == 0){
                System.out.println("兑换结束😋");
                Exchange = false;
                break;
            }else{
                System.out.println("你是否还要继续兑换");
            }
            int num2 = sc.nextInt();
            if(num2 == 0){
                Exchange = false;
                break;
            }
        }
        sc.close();
    }
}
