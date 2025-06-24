# 会议室预订系统

## 项目概述

这是一个简单的会议室预订管理系统，使用Java语言开发。系统提供了会议室信息查看、预订、查看预订信息以及根据时间查询可用会议室等功能。

## 功能特性

- 📋 查看所有会议室信息
- 🏢 预订会议室
- 📊 查看所有预订信息
- 🔍 根据指定时间查看可用会议室
- 🚪 退出系统

## 项目结构

```
ClassProject/
├── MeetingRoom.java        # 会议室实体类
├── Reservation.java        # 预订信息实体类
├── ReservationSystem.java  # 预订系统核心业务逻辑类
├── Test.java              # 主程序入口和用户界面
└── README.md              # 项目说明文档
```

## 类设计详解

### 1. MeetingRoom.java - 会议室实体类

会议室类用于存储会议室的基本信息，包括名称、容纳人数和是否有多媒体设备。

```java
package com.apiClass.Study250623.ClassProject;

public class MeetingRoom {
    private String roomName;        // 会议室名称
    private int roomCapacity;       // 容纳人数
    private boolean hasMedia;       // 是否有多媒体设备

    // Getter和Setter方法
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public boolean isHasMedia() {
        return hasMedia;
    }

    public void setHasMedia(boolean hasMedia) {
        this.hasMedia = hasMedia;
    }

    // 构造函数
    public MeetingRoom() {
    }

    public MeetingRoom(String roomName, int roomCapacity, boolean hasMedia) {
        this.roomName = roomName;
        this.roomCapacity = roomCapacity;
        this.hasMedia = hasMedia;
    }

    // 重写toString方法，用于格式化输出
    @Override
    public String toString() {
        return roomName + "\t" +
                roomCapacity + "\t\t\t" +
                (hasMedia ? "有" : "无");
    }
}
```

**设计要点：**
- 使用private修饰符保证数据封装性
- 提供完整的getter/setter方法
- 重写toString方法便于格式化显示
- 提供无参和有参构造函数

### 2. Reservation.java - 预订信息实体类

预订类用于存储单次会议室预订的详细信息，包括预订的会议室、日期和时间段。

```java
package com.apiClass.Study250623.ClassProject;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    private MeetingRoom meetingRoom;    // 预订的会议室
    private LocalDate date;             // 预订日期
    private LocalTime startTime;        // 开始时间
    private LocalTime endTime;          // 结束时间

    // Getter和Setter方法
    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    // 构造函数
    public Reservation() {
    }

    public Reservation(MeetingRoom meetingRoom, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.meetingRoom = meetingRoom;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // 格式化输出预订信息
    public String toString() {
        return STR."预定时间{\{date} \{startTime}~\{endTime}}";
    }
}
```

**设计要点：**
- 使用Java 8的LocalDate和LocalTime处理日期时间
- 关联MeetingRoom对象实现对象间的关系
- 使用Java 21的字符串模板语法（STR.）进行字符串格式化

### 3. ReservationSystem.java - 预订系统核心业务类

这是系统的核心业务逻辑类，包含所有主要功能的实现。

```java
package com.apiClass.Study250623.ClassProject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReservationSystem {
    private List<MeetingRoom> meetingRooms;    // 会议室列表
    private List<Reservation> reservations;    // 预订信息列表

    // 构造函数 - 初始化系统
    public ReservationSystem(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
        reservations = new ArrayList<>();
    }

    // 功能1：显示所有会议室信息
    public void showMeetingRooms() {
        System.out.println("--------所有会议室列表-------");
        System.out.println("名称\t\t容纳人数\t多媒体设备");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom);
        }
        System.out.println("---------------------------");
    }

    // 功能2：预订会议室
    public void reserveMeetingRoom() {
        // 展示可用会议室
        for (int i = 0; i < meetingRooms.size(); i++) {
            MeetingRoom room = meetingRooms.get(i);
            System.out.println((i + 1) + "." + room.getRoomName() + " (容纳人数：" + room.getRoomCapacity() + ", 多媒体设备：" +
                                    (room.isHasMedia() ? "有" : "无") + ")");
        }
        
        // 用户选择会议室
        System.out.println("请选择要预定的会议室：");
        Scanner sc = new Scanner(System.in);
        int roomNo = sc.nextInt();
        MeetingRoom selectedRoom = meetingRooms.get(roomNo - 1);
        
        // 用户输入预订日期
        System.out.println("您选择了" + selectedRoom.getRoomName() + ",");
        System.out.println("请选择预定日期(yyyy-mm-dd）");
        String dateStr = sc.next();
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        // 用户输入预订时间段
        System.out.println("请选择预订时间段 (例如：09:00-10:00)：");
        String timeSlot = sc.next();
        String[] times = timeSlot.split("-");
        LocalTime startTime = LocalTime.parse(times[0], DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime endTime = LocalTime.parse(times[1], DateTimeFormatter.ofPattern("HH:mm"));
        
        // 检查时间段是否可用并创建预订
        boolean available = isAvailable(selectedRoom, date, startTime, endTime);
        if (available) {
            Reservation reservation = new Reservation(selectedRoom, date, startTime, endTime);
            reservations.add(reservation);
            System.out.println("预定成功");
        }
    }

    // 辅助方法：检查会议室在指定时间是否可用
    public boolean isAvailable(MeetingRoom selectedRoom, LocalDate date, LocalTime start, LocalTime end) {
        boolean available = false;
        
        // 获取该会议室的所有预订记录
        List<Reservation> reservationList = reservations.stream()
                .filter(r -> r.getMeetingRoom().equals(selectedRoom))
                .toList();
                
        // 如果没有预订记录，则可用
        if (reservationList.isEmpty()) {
            available = true;
        }
        
        // 检查时间冲突
        for (Reservation reservation : reservationList) {
            if (date.equals(reservation.getDate())) {
                // 检查时间段是否重叠
                if (start.equals(reservation.getStartTime())) {
                    end.isAfter(reservation.getEndTime());
                    System.out.println("该时间段该会议室已被预定，请选择其他时间段或者其他会议室！");
                    available = false;
                }
            }
        }
        return available;
    }

    // 功能3：显示所有预订信息
    public void showRes() {
        System.out.println("---------------所有预定信息---------------");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getRoomName());
            
            // 获取该会议室的预订信息
            List<Reservation> roomReservations = reservations.stream()
                    .filter(reservation -> reservation.getMeetingRoom().equals(meetingRoom))
                    .collect(Collectors.toList());
                    
            for (Reservation reservation : roomReservations) {
                System.out.println(reservation);
            }
            
            if (roomReservations.isEmpty()) {
                System.out.println("无人预定");
            }
        }
        System.out.println("----------------------------------------");
    }

    // 功能4：查看指定时间段的可用会议室
    public void selectionRoomByTime() {
        Scanner sc = new Scanner(System.in);
        
        // 用户输入查询日期
        System.out.println("请输入日期(格式，年-月-日)：");
        String dateStr = sc.next();
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-mm-dd"));
        
        // 用户输入查询时间段
        System.out.println("请输入时间段(例如：09:00-10:00)：");
        String timeStr = sc.next();
        String[] times = timeStr.split("-");
        LocalTime startTime = LocalTime.parse(times[0], DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime endTime = LocalTime.parse(times[1], DateTimeFormatter.ofPattern("HH:mm"));
        
        // 找出与指定时间有冲突的预订
        List<Reservation> conflictList = reservations.stream()
                .filter(reservation -> date.equals(reservation.getDate()) &&
                        startTime.isBefore(reservation.getEndTime()) &&
                        endTime.isAfter(reservation.getStartTime()))
                .collect(Collectors.toList());
                
        // 提取冲突的会议室
        List<MeetingRoom> conflictRoom = conflictList.stream()
                .map(Reservation::getMeetingRoom)
                .collect(Collectors.toList());
                
        // 显示可用的会议室
        System.out.println("名称       容纳人数    多媒体设备");
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (!conflictRoom.contains(meetingRoom)) {
                System.out.println(meetingRoom);
            }
        }
    }
}
```

**设计要点：**
- 使用List集合管理会议室和预订信息
- 运用Stream API进行数据过滤和处理
- 使用DateTimeFormatter处理日期时间格式转换
- 实现时间冲突检测算法

### 4. Test.java - 主程序入口

主程序类包含系统初始化和用户交互界面。

```java
package com.apiClass.Study250623.ClassProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.exit;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 初始化会议室数据
        List<MeetingRoom> meetingRooms = new ArrayList<>();
        meetingRooms.add(new MeetingRoom("会议室A102", 20, true));
        meetingRooms.add(new MeetingRoom("会议室A305", 15, true));
        meetingRooms.add(new MeetingRoom("会议室B201", 50, true));
        meetingRooms.add(new MeetingRoom("会议室B303", 10, false));
        meetingRooms.add(new MeetingRoom("会议室C101", 20, false));
        
        // 创建预订系统实例
        ReservationSystem system = new ReservationSystem(meetingRooms);
        
        // 显示系统菜单
        System.out.println("-------欢迎进入会议室预订系统-------");
        System.out.println("1. 查看所有会议室");
        System.out.println("2. 预订会议室");
        System.out.println("3. 查看预订信息");
        System.out.println("4. 查看指定时间可用会议室");
        System.out.println("5. 退出系统");
        
        // 主循环 - 处理用户选择
        while (true) {
            System.out.print("请输入您选择的操作：");
            int option = sc.nextInt();
            switch (option) {
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
```

**设计要点：**
- 使用静态main方法作为程序入口
- 初始化测试数据
- 使用while循环和switch语句处理用户交互
- 提供清晰的用户界面

## 技术特性

### 使用的Java特性
- **Java 8 Time API**: 使用LocalDate和LocalTime处理日期时间
- **Stream API**: 用于数据过滤、映射和收集操作
- **Lambda表达式**: 简化集合操作代码
- **Java 21字符串模板**: 使用STR.语法进行字符串格式化

### 设计模式和最佳实践
- **封装**: 所有类的字段都使用private修饰符
- **单一职责原则**: 每个类都有明确的职责
- **面向对象设计**: 使用类和对象来模拟现实世界的实体
- **集合框架**: 使用List接口管理数据

## 系统流程

1. **系统启动**: 初始化会议室数据，创建预订系统实例
2. **用户交互**: 显示菜单，等待用户选择操作
3. **功能执行**: 根据用户选择执行相应的功能
4. **循环运行**: 持续运行直到用户选择退出

## 可能的改进方向

1. **数据持久化**: 添加数据库支持，持久化存储预订信息
2. **用户管理**: 添加用户登录和权限管理功能
3. **GUI界面**: 开发图形用户界面替代命令行界面
4. **输入验证**: 增强用户输入的验证和错误处理
5. **时间冲突检测**: 完善时间重叠检测算法
6. **配置文件**: 使用配置文件管理系统参数
7. **日志记录**: 添加操作日志记录功能
8. **单元测试**: 编写单元测试确保代码质量

## 运行说明

1. 确保Java环境已安装（建议Java 17+）
2. 编译所有Java文件
3. 运行Test类的main方法
4. 根据菜单提示进行操作

```bash
# 编译
javac *.java

# 运行
java Test
```

## 总结

这个会议室预订系统是一个简单但功能完整的Java控制台应用程序。它展示了面向对象编程的基本概念，集合框架的使用，以及现代Java特性的应用。虽然功能相对简单，但代码结构清晰，易于理解和扩展。
