package com.Class.standardizedTest.test01.PersonTest;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入中国人的信息：");
        System.out.println("姓名：");
        String name1 = sc.next();
        System.out.println("性别：");
        String sex1 = sc.next();
        System.out.println("年龄：");
        int age1 = sc.nextInt();
        Chinese p1 = new Chinese(name1,sex1,age1);

        System.out.println("请输入英国人的信息：");
        System.out.println("姓名：");
        String name2 = sc.next();
        System.out.println("性别：");
        String sex2 = sc.next();
        System.out.println("年龄：");
        int age2 = sc.nextInt();
        showEat(p1);
        English p2 = new English(name2,sex2,age2);

        p1.show();;
        p1.shadowBoxing();
        System.out.println("-------");
        p2.show();
        showEat(p2);
        p2.horseRiding();
    }
    public static void showEat(Person p) {
        p.eat();
    }
}
