package com.Class.Study250428.classWork;

import java.util.Arrays;
import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println("请输入9个整数来填充3x3数组：");
        // 输入数组元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // 打印数组
        System.out.println("数组内容：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // 计算主对角线元素之和
        int diagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            diagonalSum += arr[i][i];
        }
        
        // 计算上三角元素之和（不包括主对角线）
        int upperSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                upperSum += arr[i][j];
            }
        }
        
        // 计算下三角元素之和（不包括主对角线）
        int lowerSum = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                lowerSum += arr[i][j];
            }
        }
        
        // 输出结果
        System.out.println("主对角线元素之和：" + diagonalSum);
        System.out.println("上三角元素之和：" + upperSum);
        System.out.println("下三角元素之和：" + lowerSum);
    }
}
