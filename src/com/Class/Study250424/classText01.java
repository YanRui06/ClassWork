package com.Class.Study250424;

import java.util.Scanner;

public class classText01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=90&&n<=100){
            System.out.println("优秀");
        }
        else if(n>=80&&n<90){
            System.out.println("良好");
        }
        else if(n>=70&&n<80){
            System.out.println("中等");
        }
        else if(n>=60&&n<70){
            System.out.println("合格");
        }
        else if(n>=0&&n<60){
            System.out.println("不及格");
        }
        sc.close();
    }
}
