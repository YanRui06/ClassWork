package com.Class.Study250425;

import java.util.Scanner;

public class classTest05 {
    public static void main(String[] ager){
        Scanner scanner=new Scanner(System.in);
        int Positive_number=0;
        int Negative_number=0;
        int Zero=0;
        double i=0;
        for(;;){
            System.out.println("请输入一个数  -1结束");
            i=scanner.nextDouble();
            if(i>0)
                Positive_number++;
            else if(i<0&&i!=-1)
                Negative_number++;
            else if (i==0)
                Zero++;
            if(i==-1)
                break;
        }
        System.out.println("正数有"+Positive_number+"个");
        System.out.println("负数有"+Negative_number+"个");
        System.out.println("零有"+Zero+"个");
    }
}
