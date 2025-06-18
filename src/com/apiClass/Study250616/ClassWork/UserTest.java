package com.apiClass.Study250616.ClassWork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        UserTest userTest = new UserTest();
        UserDaoImp userDaoImp = new UserDaoImp();
        userDaoImp.initData();//初始化用户数据
//下面是注册功能
        System.out.println("新用户注册：");
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = scan.nextLine();// 获取用户名
        System.out.print("请输入密码：");
        String password = scan.nextLine();// 获取密码
        System.out.print("请重复密码：");
        String repassword = scan.nextLine();// 获取重复密码
        System.out.print("出生日期：");
        String birthday = scan.nextLine();// 获取出生日期
        System.out.print("手机号码：");
        String telNumber = scan.nextLine();// 获取手机号码
        System.out.print("电子邮箱：");
        String email = scan.nextLine();// 获取电子邮箱
// 校验用户信息,返回登录状态信息
        boolean pass = userDaoImp.checkUser(userName, password, repassword,
                birthday, telNumber, email);
        if (pass) {
//将用户输入的信息，封装成对象
// 格式化日期返回 Date 对象
//定义日期格式
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date dateBirthday = null;
            try {
// 将生日格式化成日期格式
                dateBirthday = format.parse(birthday);
                User newUser = new User(userName, repassword, dateBirthday,
                        telNumber, email);
                if (userDaoImp.registerUser(newUser)) {
                    System.out.println("用户" + userName + "注册成功！");
                    System.out.println("系统用户列表：");
                    userDaoImp.showAllUser();
                }
            } catch (ParseException e) {
                System.out.println("注册失败！");
                e.printStackTrace();
            }
        }
    }
}
