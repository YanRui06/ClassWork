package com.apiCLass.Class250605.Study250612.Classwork;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入要转换的字符串：");
        String input = scanner.nextLine();

        System.out.println("二进制的数是：");
        String exchange = convert(input);
        System.out.println(exchange);

        scanner.close();
    }

    private static String convert(String str) {
        StringBuilder binaryBuilder = new StringBuilder();

        // 遍历字符串中的每个字符
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 获取字符的ASCII码值
            int ascii = (int) c;
            // 将ASCII码转换为二进制字符串
            String binaryString = Integer.toBinaryString(ascii);
            // 补齐到8位（一个字节）
            String padded = String.format("%8s", binaryString).replace(' ', '0');
            // 添加到结果中
            binaryBuilder.append(padded);
        }

        return binaryBuilder.toString();
    }
}