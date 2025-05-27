package com.Class.Study250425;

import java.util.Scanner;

public class classTest02 {
    public static void main(String[] args) {
        double yashua = 8.8;
        double maojin = 10.0;
        double shuibei = 18.8;
        double apple = 12.5;
        double banana = 15.5;
        System.out.println("----------黑马小商城----------");
        System.out.println("1.牙刷的价格为："+yashua+"元");
        System.out.println("2.毛巾的价格为："+maojin+"元");
        System.out.println("3.水杯的价格为："+shuibei+"元");
        System.out.println("4.苹果的价格为："+apple+"元");
        System.out.println("5.香蕉的价格为："+banana+"元");
        boolean i = true;
        while(i){
            System.out.println("请输入你需要购买商品的序列号：");
            Scanner scanner1 = new Scanner(System.in);
            int xh = scanner1.nextInt();
            String cp = "产品";
            double dj = 0;
            switch(xh){
                case 1:
                    dj = yashua;
                    cp = "牙刷";
                    break;
                case 2:
                    dj = maojin;
                    cp = "毛巾";
                    break;
                case 3:
                    dj = shuibei;
                    cp = "水杯";
                    break;
                case 4:
                    dj = apple;
                    cp = "苹果";
                    break;
                case 5:
                    dj = banana;
                    cp = "香蕉";
                    break;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
            System.out.println("请输入你需要购买"+cp+"的数量：");
            Scanner scanner2 = new Scanner(System.in);
            int sl = scanner2.nextInt();
            double je =  dj * sl;
            System.out.println("您购买了"+cp+ ""+sl+"个，需要花费"+je+"元");
            Scanner scanner3 = new Scanner(System.in);
            char ch = scanner3.next().charAt(0);
            if (ch == 'N'){
                i = false;
                System.out.println("期待您的下次光临");
            }
        }
    }
}
