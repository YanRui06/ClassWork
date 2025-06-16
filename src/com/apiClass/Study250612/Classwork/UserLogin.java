package com.apiClass.Study250612.Classwork;

import java.util.Scanner;

public class UserLogin {
    // 预设的正确用户名和密码
    private static final String CORRECT_USERNAME = "root";
    private static final String CORRECT_PASSWORD = "abc123";
    private static final int MAX_ATTEMPTS = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0; // 登录尝试次数
        boolean loginSuccess = false;
        
        while (attempts < MAX_ATTEMPTS && !loginSuccess) {
            System.out.print("请输入用户名：");
            String username = scanner.nextLine();
            
            System.out.print("请输入用户密码：");
            String password = scanner.nextLine();
            
            // 验证用户名和密码
            if (CORRECT_USERNAME.equals(username) && CORRECT_PASSWORD.equals(password)) {
                System.out.println("登录成功！");
                loginSuccess = true;
            } else {
                attempts++;
                int remainingAttempts = MAX_ATTEMPTS - attempts;
                
                if (remainingAttempts > 0) {
                    System.out.println("登录失败，还有 " + remainingAttempts + " 次机会");
                } else {
                    System.out.println("你的账户被锁定了，请联系管理员！！");
                }
            }
        }
        
        scanner.close();
    }
}