package com.Class.Study250424;

import java.util.Scanner;

public class classTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("29天");
                } else {
                    System.out.println("28天");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
        }


    }
}
