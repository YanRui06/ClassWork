package com.apiClass.Study250616;

import com.Class.standardizedTest.test01.PersonTest.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class ClubMembersManage {

    private static List<Member> members = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addMember() {
        boolean flag = false;
        System.out.println("请输入成员的编号、姓名、年龄和年级：");
        do {
            int memberID = sc.nextInt();
            String memberName = sc.next();
            int age = sc.nextInt();
            String gender = sc.next();
            for (Member member : members) {
                if (member.getId() == memberID) {
                    flag = true;
                }
            }
            if (!flag) {
                Member newMember = new Member(memberID, memberName, age, gender);
                members.add(newMember);
                System.out.println("成功添加成员：" + members);
            } else {
                System.out.println("成员编号已存在，请选择其他编号并重新输入：");
            }
        } while (flag);
    }


    public static void updateMember() {
        System.out.println("请输入成员的编号：");
        int memberID = sc.nextInt();
        System.out.println("请输入新的年龄和年级");
        int age = sc.nextInt();
        String gender = sc.next();
        for (Member member : members) {
            if (member.getId() == memberID) {
                member.setAge(age);
                member.setGarde(gender);
                System.out.println("成功修改成员：" + member);
                return;
            }
        }
        System.out.println("成员编号输入错误！：" + memberID);
    }


    public static void searchMember() {
        List<Member> searchMembers = new ArrayList<>();
        System.out.println("请输入年级：");
        String grade = sc.next();
        for (Member member : members) {
            if (member.getGarde().equals(grade)) {
                searchMembers.add(member);
            }
        }
        if (!searchMembers.isEmpty()) {
            System.out.println(grade + "的成员信息如下------");
            selectAll(searchMembers);
        } else {
            System.out.println("社团中没有" + grade + "的成员！");
        }
    }

    private static void selectAll(List<Member> members) {
        System.out.println("成员编号  姓名  年龄  年级  ");
        for (Member member : members) {
            System.out.print("   " + member.getId() + "     ");
            System.out.print(member.getName() + "   ");
            System.out.print(member.getAge() + "岁   ");
            System.out.print(member.getGarde());
            System.out.println();
        }
    }


    public static void deleteMember() {
        System.out.println("请输入成员编号：");
        int memberID = sc.nextInt();
        for (Member member : members) {
            if (member.getId() == memberID) {
                members.remove(member);
                System.out.println("成功删除成员：" + member);
                return;
            }
        }
        System.out.println("查无此人：" + memberID);
    }

    public static void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("没有成员");
        } else {
            System.out.println("----------社团所有成员----------");
            selectAll(members);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------书法社团成员管理系统--------");
        System.out.println("1. 查看目前社团所有成员");
        System.out.println("2. 添加社团成员");
        System.out.println("3. 修改成员信息");
        System.out.println("4. 查看指定年级的成员");
        System.out.println("5. 移除成员");
        System.out.println("6. 退出系统");
        while (true) {
            System.out.print("请输入要进行的操作：");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    displayMembers();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    updateMember();
                    break;
                case 4:
                    searchMember();
                    break;
                case 5:
                    deleteMember();
                    break;
                case 6:
                    sc.close();
                    System.out.println("退出系统...");
                    exit(0);
            }
        }
    }

}
