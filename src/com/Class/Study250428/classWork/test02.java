package com.Class.Study250428.classWork;

import java.util.Random;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        System.out.println("-----------抽取幸运观众-----------");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("存储第" + (i + 1) + "个姓名:");
            arr[i] = sc.next();
        }
        int n = rand.nextInt(3);
        System.out.println(n);
        System.out.println(arr[n]);

    }
}
