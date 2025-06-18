package com.apiClass.Study250616.ClassWork;

//用户的操作接口的实现类

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class UserDaoImp implements UserDao {

    //用户操作的实现类
    public HashSet<User> USER_DATA = new HashSet<User>(); //

    @Override
    public boolean registerUser(User newUser) {
        if (!USER_DATA.add(newUser)) {
            System.out.println("用户存在");
            return false;
        }
        System.out.println("注册成功");
        return true;
    }

    @Override
    public boolean checkUser(String username, String password, String rePassword, String birthday, String phone, String email) {
        if (!password.equals(rePassword)) {// 判断密码和重复密码是否相同
            System.out.println("两次输入密码不一致!\r\n");
            return false;
        }
// 生日判断
        if (birthday.length() != 10) {// 字符串长度不为 10，则认为格式错误
            System.out.println("生日格式不正确!\r\n");
            return false;
        } else {
            for (int i = 0; i < birthday.length(); i++) {
                Character thisChar = birthday.charAt(i);
                if (i == 4 || i == 7) {
                    if (!(thisChar == '-')) {// 验证第 4 位和第 7 位是否是符号“-”
                        System.out.println("生日格式不正确!\r\n");
                        return false;
                    }
                } else {// 验证除了第 4 位和第 7 位的字符是否是 0~9 的数字
                    if (!(Character.isDigit(thisChar))) {
                        System.out.println("生日格式不正确!\r\n");
                        return false;
                    }
                }
            }
        }
// 手机号判断
// 判断手机号长度不等于 11 位则认为此手机号无效
        if (phone.length() != 11) {
            System.out.println("手机号码不正确!\r\n");
            return false;
// 默认有效手机号为 13、15、17 和 18 开头的手机号
        } else if (!(phone.startsWith("13") || phone.startsWith("15")
                || phone.startsWith("17") || phone.startsWith("18"))) {
            System.out.println("手机号码不正确!\r\n");
            return false;
        }
// 邮箱判断
// 判断邮箱地址，默认不带@符号的邮箱为无效邮箱
        if (!email.contains("@")) {
            System.out.println("邮箱不正确!\r\n");
            return false;
        }
        return true;
    }

    @Override
    public void initData() {
        User user = new User("张三", "zz,123", new Date(),
                "18810319240", "zhangzheng@itcast.cn");
        User user2 = new User("李四", "zq,123", new Date(),
                "18618121193", "zhouqi@itcast.cn");
        USER_DATA.add(user);
        USER_DATA.add(user2);
    }

    @Override
    public void showAllUser() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (User user : USER_DATA) {
            System.out.println(user.getUserName()+":"+user.getPassword()+":"+
                    dateFormat.format(user.getBirthday())+":"+user.getTelNumber()+":"+user.getEmail());
        }
    }
}
