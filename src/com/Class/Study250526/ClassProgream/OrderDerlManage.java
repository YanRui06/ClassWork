package com.Class.Study250526.ClassProgream;

import java.util.Scanner;

public class OrderDerlManage {
    public static void main(String[] args) {
        //待配送订单
        Order order01 = new Order("0001", "待配送订单");
        Order order02 = new Order("0002", "待配送订单");
        Order order03 = new Order("0003", "待配送订单");
        Order[] orders = {order01, order02, order03};
        //配送员信息
        Delivery delivery01 = new Deliveryman("李四", "外卖员");
        Delivery delivery02 = new Deliveryman("王五", "外卖员");
        Delivery delivery03 = new Waiter("赵六", "服务员");
        //待配送订单数量
        int count = orders.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("---------订单配送管理--------");
        System.out.println("1.查询订单");
        System.out.println("2.配送订单");
        while (true) {
            System.out.println("请输入要进行的操作：");
            int input = sc.nextInt();
            switch (input) {
                //查询订单
                case 1:
                    for (int i = 0; i < orders.length; i++) {
                        Order order = orders[i];
                        order.orderInfo();
                        if (order.getState().equals("配送中")) {
                            System.out.println("配送员信息：");
                            order.getPersion().interoduction();
                        }
                    }
                    break;
                //配送订单
                case 2:
                    if (count == 0) {
                        System.out.println("不存在要配送的订单！");
                    } else {
                        delivery01.delivery(orders[0]);
                        count--;
                        delivery02.delivery(orders[1]);
                        count--;
                        delivery03.delivery(orders[2]);
                        count--;
                    }
                    break;
                case 3:
                    System.out.println("退出系统...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("输入有误，请重新输入");

            }
        }
    }
}
