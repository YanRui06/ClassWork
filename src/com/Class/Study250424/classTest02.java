package com.Class.Study250424;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class classTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入是否为会员 是：y/否：其他字符");
        String input = sc.nextLine();
        char vip = input.charAt(0);
        System.out.println("请输入购买金额：");
        int money = sc.nextInt();
        double end = 0;
        if(vip == 'y'){
            if(money >= 100&&money < 200){
                end = money * 0.9;
            }
            else if(money>=200){
                end = money * 0.75;
            }
        }else{
            System.out.println(money);
        }
        System.out.println(end);
    }
}
