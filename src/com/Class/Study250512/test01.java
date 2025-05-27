package com.Class.Study250512;

import java.util.ArrayList;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------打印小票-------");
        System.out.println("请输入顾客购买商品的种类数");
        int num = sc.nextInt();
        saveProlunce(num);
    }
    
    public static void saveProlunce(int num) {
        Scanner sc = new Scanner(System.in);
        ArrayList<listPay> list = new ArrayList<>();
        double totalAmount = 0;
        
        System.out.println("\n开始输入商品信息");
        System.out.println("------------------------");
        for (int i = 0; i < num; i++) {
            listPay pay = new listPay();
            pay.setName(sc.next());
            pay.setMoney(sc.nextDouble());
            pay.setNum(sc.nextInt());
            list.add(pay);
        }

        System.out.println("\n\n=========================");
        System.out.println("         购物小票        ");
        System.out.println("=========================");
        System.out.println("商品名称    单价    数量    小计");
        System.out.println("-------------------------");

        for (int i = 0; i < list.size(); i++) {
            listPay item = list.get(i);
            double itemTotal = item.getMoney() * item.getNum();
            item.setList(itemTotal);
            totalAmount += itemTotal;
            System.out.printf("%-10s %-7.2f %-6d %-7.2f\n",
                    item.getName(),
                    item.getMoney(),
                    item.getNum(),
                    item.getList());
        }
        System.out.println("=========================");
        System.out.printf("总计金额：%.2f元\n", totalAmount);
        System.out.println("=========================");
        System.out.println("感谢您的惠顾，欢迎再次光临！");

        sc.close();


    }
}
