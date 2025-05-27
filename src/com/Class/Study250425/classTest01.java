package com.Class.Study250425;

import java.util.Scanner;

public class classTest01 {
    public static void main(String[] args) {
        System.out.println("请输入正整数m：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入正整数n：");
        Scanner scanner1 = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner1.nextInt();

        int big1 = find1(m, n);
        int bigs = finds(m, n, big1);
        System.out.println("while：");
        System.out.println("最大公约数为："+big1);
        System.out.println("最小公倍数为："+bigs);
        System.out.println("\n");

        int big2 = find2(m, n);
        System.out.println("do while：");
        System.out.println("最大公约数为："+big2);
        System.out.println("最小公倍数为："+bigs);
        System.out.println("\n");

        int big3 = find3(m, n);
        System.out.println("for：");
        System.out.println("最大公约数为："+big3);
        System.out.println("最小公倍数为："+bigs);
    }
    public static int find1(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int find2(int a, int b) {
        do {
            if (b == 0) break;
            int temp = b;
            b = a % b;
            a = temp;
        } while (b != 0);
        return a;
    }

    public static int find3(int a, int b) {
        for (; b != 0; ) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int finds(int a, int b, int zdgys) {
        return (a * b) / zdgys;
    }
}
