package com.Class.standardizedTest.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        while (true) {
            Show();
            String choose = sc.next();

            switch (choose) {
                case "1" -> showStudent(students);
                case "2" -> addStudent(students);
                case "3" -> deleteStudent(students);
                case "4" -> updateStudent(students);
                case "5" -> {
                    System.out.println("退出系统");
                    //break loop;
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }

    }

    public static void Show() {
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1，查看所有学生");
        System.out.println("2，添加学生");
        System.out.println("3，删除学生");
        System.out.println("4，修改学生");
        System.out.println("5，退出");
        System.out.println("请输入你的选择：");
    }

    public static void showStudent(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("NO student");
            return;
        }
        System.out.println("ID\t姓名\t年龄\t1地址");
        for(Student student : students) {
            System.out.println(student.getID() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());

        }
    }

    public static boolean checkID(ArrayList<Student> students, String id) {
        return getIndex(students, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> students, String ID) {
        for (int i = 0; i < students.size(); i++) {
            //得到学生对象
            Student student = students.get(i);
            if (student.getID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }

    public static void addStudent(ArrayList<Student> students) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生ID：");
            String ID = sc.next();
            boolean flag = checkID(students, ID);
            if (flag) {
                System.out.println("学生存在");
            } else {
                student.setID(ID);
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        student.setName(sc.next());
        System.out.println("请输入学生年龄：");
        student.setAge(sc.nextInt());
        System.out.println("请输入学生家庭住址：");
        student.setAddress(sc.next());
        students.add(student);
        System.out.println("添加成功");
    }

    public static void deleteStudent(ArrayList<Student> students) {
        System.out.println("请输入要删除的学生ID");
        String ID = sc.next();
        int index = getIndex(students, ID);
        if (index >= 0) {
            students.remove(index);
            System.out.println("删除学生成功");
        } else {
            System.out.println("id不存在");
        }
    }

    public static void whichExchange(ArrayList<Student> students, int index, String info) {
        Student student = students.get(index);
        switch (info) {
            case "姓名":
                String name = sc.next();
                student.setName(name);
                System.out.println("OK");
                break;
            case "年龄":
                int age = sc.nextInt();
                student.setAge(age);
                System.out.println("OK");
                break;
            case "家庭地址":
                String address = sc.next();
                student.setAddress(address);
                System.out.println("OK");
                break;


        }
    }

    public static void updateStudent(ArrayList<Student> students) {
        System.out.println("请输入要修改的学生ID");
        String ID = sc.next();
        int index = getIndex(students, ID);
        if (index == -1) {
            System.out.println("学生不存在");
        }
        System.out.println("请输入你要修改的信息（姓名，年龄，家庭地址）");
        String info = sc.next();
        whichExchange(students, index, info);
    }
}
