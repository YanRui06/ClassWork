package com.Class.Study250428.classWork;

import java.util.Arrays;
import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数组长度");
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
