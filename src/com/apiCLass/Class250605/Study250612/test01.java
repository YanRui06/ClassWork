package com.apiCLass.Class250605.Study250612;

import java.util.Random;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String code = "+-×÷";
        
        for (int i = 1; i <= 50; i++) {
            int size = code.length();
            int index = rand.nextInt(size);
            char operator = code.charAt(index);
            
            int num1 = rand.nextInt(100) + 1;
            int num2 = rand.nextInt(100) + 1;
            
            System.out.printf("%d %c %d = \t", num1, operator, num2);
            
            // 每5题换行
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        scanner.close();
    }
}
