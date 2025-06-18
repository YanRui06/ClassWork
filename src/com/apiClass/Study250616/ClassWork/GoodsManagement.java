package com.apiClass.Study250616.ClassWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GoodsManagement {
    static ArrayList<Phone> c = new ArrayList();

    //主方法可以直接复制
    public static void main(String[] args) {
        boolean isEnd = false;
        initGoods(); //商品初始化
        while (true) {
            System.out.println("欢迎使用库房管理系统,请选择要进行的操作");
            System.out.println("1. 商品入库");
            System.out.println("2. 显示商品");
            System.out.println("3. 删除商品");
            System.out.println("4. 退出系统");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入功能选择：");
            int s = sc.nextInt();
            switch (s) {
                case 1: //商品入库
                    addwarehouse();
                    System.out.println("商品入库成功，入库后仓库商品如下：");
                    warehouse();
                    break;
                case 2: //显示商品
                    warehouse();
                    break;
                case 3: //删除商品
                    System.out.print("请输入你要删除的商品编号：");
                    String gid = sc.next();
                    boolean isOk = delwarehouse(gid);
                    if (isOk) {
                        System.out.println("编号：" + gid + " 的商品已经删除！");
                        System.out.println("删除商品后仓库商品如下：");
                        warehouse();
                    } else {
                        System.out.println("商品删除失败，商品编号不存在！");
                    }
                    break;
                case 4:
                    isEnd = true;
                    break;
                default:
                    System.out.println("功能选择错误!");
                    break;
            }
            if (isEnd) {
                System.out.println("您已经退出系统！");
                break;
            }
        }

    }

    //仓库商品初始化方法可以直接复制
    private static void initGoods() {
        c.add(new Phone("M202301001", "小米 9", "玫瑰金", 3999.00, 15));
        c.add(new Phone("M202301002", "小米 9", "幻彩紫", 3699, 28));
        c.add(new Phone("M202301003", "华为 P30", "白金色", 5699, 2));
        c.add(new Phone("M202301004", "华为 P30", "绚彩白", 5999, 18));
        c.add(new Phone("M202301005", "VIVO PLus9", "幻彩紫", 2699, 28));
        c.add(new Phone("M202301006", "魅族 16th", "紫金黑", 5229, 10));
        c.add(new Phone("M202301007", "苹果 11", "土豪金", 8999, 51));
    }

    private static void addwarehouse() {
        while (true){
            System.out.println("您是否录入商品？Y/N");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            if (s.equalsIgnoreCase("Y")) {
                Scanner sc1= new Scanner(System.in);
                System.out.print("请输入商品的编号：");
                String gid = sc1.next();
                System.out.print("请输入商品的名称:");
                String name = sc1.next();
                System.out.print("请输入商品的颜色：");
                String color = sc1.next();
                System.out.print("请输入商品的价格：");
                int p=sc1.nextInt();
                System.out.print("请输入商品的数量：");
                int n =sc1.nextInt();
                c.add(new Phone(gid,name,color, p,n));
            }
        }
    }

    private static void warehouse() {
        Iterator it = c.iterator();
        if(c.isEmpty()){
            System.out.println("暂无商品");
            return;
        }
        System.out.printf("%-16s%-18s%-18s%-10s%-10s\n","商品编号","商品名称","商品颜色","商品价格","商品数量");
        while (it.hasNext()) {
            Phone p = (Phone) it.next();
            System.out.printf("%-20s%-20s%-20s%-12.1f%-12d\n",p.getGid(),p.getName(),p.getColor(),p.getPrice(),p.getNum());
        }

    }

    private static boolean delwarehouse(String gid) {
        for (int i = 0; i < c.size(); i++) {
            if(c.get(i).getGid().equalsIgnoreCase(gid)) {
                c.remove(i);
                return true;
            }
        }
        return false;
    }



}
