package com.Class.Study250421;

import java.util.Scanner;
public class Study250421 {
    public static void main(String[] args) {
        String stu1 = "张三";
        String stu2 = "李四";
        String stu3 = "王五";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入张三的成绩");
        int stuChinese = sc.nextInt();
        int stuMath = sc.nextInt();
        int stuEnglish = sc.nextInt();
        System.out.println("请输入王五的成绩");
        int stu2Chinese = sc.nextInt();
        int stu2Math = sc.nextInt();
        int stu2English = sc.nextInt();
        System.out.println("请输入李四的成绩");
        int stu3Chinese = sc.nextInt();
        int stu3Math = sc.nextInt();
        int stu3English = sc.nextInt();

        double stu1AverageScore = (double) (stuChinese + stuMath + stuEnglish) /3;
        double stu2AverageScore = (double) (stu2Chinese + stu2Math + stu2English) /3;
        double stu3AverageScore = (double) (stu3Chinese + stu3Math + stu3English) /3;

        System.out.println("--------------------成绩单" + "--------------------");
        System.out.println("姓名      语文       数学       英语       平均分");
        System.out.println(stu1 + "      " + stuChinese + "      " + stuMath + "     " + stuEnglish + "      " + stu1AverageScore);
        System.out.println(stu2 + "      " + stu2Chinese + "      " + stu2Math + "     " + stu2English + "      " + stu2AverageScore);
        System.out.println(stu3 + "      " + stu3Chinese + "      " + stu3Math + "     " + stu3English + "      " + stu3AverageScore);
        System.out.println("-----------------------------" + "-----------------");

        double maxAverageScore = stu1AverageScore > stu2AverageScore ? stu1AverageScore : stu2AverageScore;
        maxAverageScore = maxAverageScore > stu3AverageScore ? maxAverageScore : stu3AverageScore;

        System.out.println("此次考试平均成绩最高的分数：" + maxAverageScore );











    }
}

