package com.apiClass.Study250623.ClassProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.exit;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MeetingRoom> meetingRooms = new ArrayList<>();
        meetingRooms.add(new MeetingRoom("会议室A102",20,true));
        meetingRooms.add(new MeetingRoom("会议室A305",15,true));
        meetingRooms.add(new MeetingRoom("会议室B201",50,true));
        meetingRooms.add(new MeetingRoom("会议室B303",10,false));
        meetingRooms.add(new MeetingRoom("会议室C101",20,false));
        ReservationSystem system = new ReservationSystem(meetingRooms);
        System.out.println("-------欢迎进入会议室预订系统-------");
        System.out.println("1. 查看所有会议室");
        System.out.println("2. 预订会议室");
        System.out.println("3. 查看预订信息");
        System.out.println("4. 查看指定时间可用会议室");
        System.out.println("5. 退出系统");
        while (true){
            System.out.print("请输入您选择的操作：");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    system.showMeetingRooms();
                    break;
                case 2:
                    system.reserveMeetingRoom();
                    break;
                case 3:
                    system.showRes();
                    break;
                case 4:
                    system.selectionRoomByTime();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}