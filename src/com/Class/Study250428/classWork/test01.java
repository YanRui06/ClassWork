package com.Class.Study250428.classWork;

import java.util.Scanner;

public class test01 {
    private static Login[] log = new Login[10];
    // 初始化默认用户
    static {
        log[0] = new Login("admin", "123456");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("----------管理系统----------");
            System.out.println("1,登录功能(login)");
            System.out.println("2,注册功能(register)");
            System.out.println("3,查看(show)");
            System.out.println("4,退出(exit)");
            int number = sc.nextInt();
            switch (number){
                case 1:
                    Logining();
                    break;
                case 2:
                    Register();
                    break;
                case 3:
                    showAllUsers();
                    break;
                case 4:
                    System.out.println("感谢使用，再见！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }

    public static void Logining(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        
        // 验证用户名和密码
        boolean found = false;
        for(int i = 0; i < log.length && log[i] != null; i++) {
            if(log[i].getUsername().equals(userName) && log[i].getPassword().equals(password)) {
                System.out.println("登录成功！");
                found = true;
                break;
            }
        }
        
        if(!found) {
            System.out.println("用户名或密码错误！");
        }
    }

    public static void Register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要注册的用户名：");
        String userName = scanner.nextLine();
        
        // 检查用户名是否已存在
        boolean exists = false;
        int emptyIndex = -1;
        
        for(int i = 0; i < log.length; i++) {
            if(log[i] != null) {
                if(log[i].getUsername().equals(userName)) {
                    exists = true;
                    break;
                }
            } else if(emptyIndex == -1) {
                emptyIndex = i;
            }
        }
        
        if(exists) {
            System.out.println("用户名已存在，请选择其他用户名！");
            return;
        }
        
        if(emptyIndex == -1) {
            System.out.println("系统用户已满，无法注册新用户！");
            return;
        }
        
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        
        // 创建新用户
        log[emptyIndex] = new Login(userName, password);
        System.out.println("注册成功！");
    }
    
    public static void showAllUsers() {
        System.out.println("----------所有用户信息----------");
        boolean hasUsers = false;
        
        for(int i = 0; i < log.length; i++) {
            if(log[i] != null) {
                System.out.println("用户名：" + log[i].getUsername());
                System.out.println("密码：" + log[i].getPassword());
                System.out.println("-------------------------");
                hasUsers = true;
            }
        }
        
        if(!hasUsers) {
            System.out.println("当前系统中没有用户！");
        }
    }
}
