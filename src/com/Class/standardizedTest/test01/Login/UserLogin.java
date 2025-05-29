package com.Class.standardizedTest.test01.Login;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("admin",123));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要生成的验证码位数：");
        int checkSum = sc.nextInt();
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        int password = sc.nextInt();
        System.out.println("校验码");
        String code = generateCheckCode(checkSum);
        System.out.println(code);
        System.out.println("请输入校验码：");
        String enterCode = sc.next();
        boolean test = username.equals(users.get(0).getUsername()) && password == users.get(0).getPassword() && code.equalsIgnoreCase(enterCode);
        if(test){
            System.out.println("欢迎您"+username);
        }else{
            System.out.println("用户名，密码验证码不对，请重新输入");
        }




    }

    public static String generateCheckCode(int codeLength) {
        Random random = new Random();
        StringBuilder checkCode = new StringBuilder();

        // 包含数字、大小写字母的字符池
        String codes = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int Size = codes.length();

        for (int i = 0; i < codeLength; i++) {
            // 从字符池中随机选择字符
            int index = random.nextInt(Size);
            checkCode.append(codes.charAt(index));
        }

        return checkCode.toString();
    }
}
