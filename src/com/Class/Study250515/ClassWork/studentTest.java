package com.Class.Study250515.ClassWork;

import java.util.ArrayList;
import java.util.Scanner;

public class studentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("2022-3-01","sunwen",19));
        students.add(new Student("2022-3-08","liuqi",20));
        students.add(new Student("2022-3-11","zhaoliu",21));
        students.add(new Student("2022-3-15","wangwu",18));
        students.add(new Student("2022-3-03","lisi",20));
        System.out.println("排序之前");
        printStudent(students);
        System.out.println("按学号升序排序后");
        sortBySno(students);
        printStudent(students);
        System.out.println("所有学生年龄加一后");
        addAge(students);
        printStudent(students);
        System.out.println("大于20岁的学生有"+findTop(students)+"人");
    }


    public static void printStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("无学生");
        }else {
            System.out.println("姓名 \t学号 \t年龄 \t");
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
        }
        System.out.println("-----------------------");
    }

    public static void sortBySno(ArrayList<Student> students) {
        students.sort((s1,s2)->s1.getSno().compareTo(s2.getSno()));

    }

    public static void addAge(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.setAge(student.getAge() + 1);
        }
    }

    public static int findTop(ArrayList<Student> students){
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getAge()>20){
                index++;
            }
        }
        return index;
    }
}
