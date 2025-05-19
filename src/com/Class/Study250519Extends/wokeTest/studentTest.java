package com.Class.Study250519Extends.wokeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class studentTest {

    public static void main(String[] args) {
        ArrayList<CollegeStudent> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String sno = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入专业：");
        String domain = sc.next();
        students.add(new CollegeStudent(sno, name, domain));
        students.add(new CollegeStudent("2023-10","wangwu","软件技术"));
        for (int i = 0; i < students.size(); i++) {
            CollegeStudent student = students.get(i);
            System.out.println("学号：" + student.getSno() + 
                             ", 姓名：" + student.getName() + 
                             ", 专业：" + student.getDomain());
        }
    }
}
