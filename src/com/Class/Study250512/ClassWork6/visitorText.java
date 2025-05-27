package com.Class.Study250512.ClassWork6;

import java.util.Scanner;

public class visitorText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Visitor visitor = new Visitor();

        System.out.println("请输入游人的姓名：");
        visitor.setVisitorName(sc.next());
        System.out.println("请输入游人的年龄：");
        visitor.setVisitorAge(sc.nextInt());
        System.out.println("游人姓名"+visitor.getVisitorName()+"\t"+"游人年龄"+visitor.getVisitorAge());
        if(visitor.getVisitorAge()>=60||visitor.getVisitorAge()<=12){
            System.out.println("门票免费");
        }else{
            System.out.println("门票20");
        }

    }
}
