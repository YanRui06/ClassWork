package com.apiClass.Study250623.ClassProject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReservationSystem {
    //会议室
    private List<MeetingRoom> meetingRooms;
    //预定信息
    private List<Reservation> reservations;

    public ReservationSystem(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
        reservations = new ArrayList<>();
    }

    public void showMeetingRooms() {
        System.out.println("--------所有会议室列表-------");
        System.out.println("名称\t\t容纳人数\t多媒体设备");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom);
        }
        System.out.println("---------------------------");
    }

    public void reserveMeetingRoom() {
        //展示可用会议室
        for (int i = 0; i < meetingRooms.size(); i++) {
            MeetingRoom room = meetingRooms.get(i);
            System.out.println((i + 1) + "." + room.getRoomName() + " (容纳人数：" + room.getRoomCapacity() + ", 多媒体设备：" +
                                    (room.isHasMedia() ? "有" : "无") + ")");
        }
        //选择会议室
        System.out.println("请选择要预定的会议室：");
        Scanner sc = new Scanner(System.in);
        int roomNo = sc.nextInt();
        MeetingRoom selectedRoom = meetingRooms.get(roomNo - 1);
        //选择预定日期
        System.out.println("您选择了" + selectedRoom.getRoomName() + ",");
        System.out.println("请选择预定日期(yyyy-mm-dd）");
        String dateStr = sc.next();
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        //选择预定时间
        System.out.println("请选择预订时间段 (例如：09:00-10:00)：");
        String timeSlot = sc.next();
        String[] times = timeSlot.split("-");
        LocalTime startTime = LocalTime.parse(times[0], DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime endTime = LocalTime.parse(times[1], DateTimeFormatter.ofPattern("HH:mm"));
        //判断该会议室该时间是否被预定
        boolean avaiable = isAvailable(selectedRoom, date, startTime, endTime);
        if (avaiable) {
            Reservation reservation = new Reservation(selectedRoom, date, startTime, endTime);
            reservations.add(reservation);
            System.out.println("预定成功");
        }
    }

    public boolean isAvailable(MeetingRoom selectedRoom, LocalDate date, LocalTime start, LocalTime end) {
        boolean available = false;
        List<Reservation> reservationList = reservations.stream()
                .filter(r -> r.getMeetingRoom().equals(selectedRoom))
                .toList();
        if (reservationList.isEmpty()) {
            available = true;
        }
        //如果该会议室某段时间已被预定
        for (Reservation reservation : reservationList) {
            if (date.equals(reservation.getDate())) {
                //判断时间是否重合
                if (start.equals(reservation.getStartTime())) {
                    end.isAfter(reservation.getEndTime());
                    System.out.println("该时间段该会议室已被预定，请选择其他时间段或者其他会议室！");
                    available = false;
                }
            }
        }
        return available;
    }

    //会议室预定情况展示
    public void showRes() {
        System.out.println("---------------所有预定信息---------------");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getRoomName());
            List<Reservation> roomReservations = reservations.stream()
                    .filter(reservation -> reservation.getMeetingRoom().equals(meetingRoom))
                    .collect(Collectors.toList());
            for (Reservation reservation : roomReservations) {
                System.out.println(reservation);
            }
            if (roomReservations == null) {
                System.out.println("无人预定");
            }
        }
        System.out.println("----------------------------------------");
    }

    //查看某段时间内可用会议室
    public void selectionRoomByTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期(格式，年-月-日)：");
        String dateStr = sc.next();
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-mm-dd"));
        System.out.println("请输入时间段(例如：09:00-10:00)：");
        String timeStr = sc.next();
        String[] times = timeStr.split("-");
        LocalTime startTime = LocalTime.parse(times[0], DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime endTime = LocalTime.parse(times[1], DateTimeFormatter.ofPattern("HH:mm"));
        //指定时间与已预订时间有冲突的会议室
        List<Reservation> conflictList = reservations.stream()
                .filter(reservation -> date.equals(reservation.getDate()) &&
                        startTime.isBefore(reservation.getEndTime()) &&
                        endTime.isAfter(reservation.getStartTime()))
                .collect(Collectors.toList());
        List<MeetingRoom> conflictRoom = conflictList.stream()
                .map(Reservation::getMeetingRoom)
                .collect(Collectors.toList());
        //输出所有与指定时间不冲突的预订信息
        System.out.println("名称       容纳人数    多媒体设备");
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (!conflictRoom.contains(meetingRoom)) {
                System.out.println(meetingRoom);
            }
        }
    }
}

