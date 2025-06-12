package com.apiCLass.Class250605.Study250609.ClassWork;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScheduleManage {
    private static Schedule[] schedules = new Schedule[20];
    private static int num = 0;
    
    public static void addSchedules() {
        Scanner scanner = new Scanner(System.in);
        String option = new String();
        
        do {
            if (num >= 20) {
                System.out.println("日程已满，无法再添加！");
                break;
            }
            
            System.out.print("请输入标题：");
            String title = scanner.nextLine();
            
            System.out.print("请输入日期(格式：yyyy-MM-dd)：");
            String date = scanner.nextLine();
            
            System.out.print("请输入时间(格式：HH:mm)：");
            String time = scanner.nextLine();
            
            String dateTimeStr = date + " " + time;
            
            try {
                // 获取日期对象
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
                
                if (dateTime.isAfter(LocalDateTime.now())) {
                    schedules[num] = new Schedule(title, dateTime);
                    num++;
                    System.out.println("日程已创建！");
                } else {
                    System.out.println("日程时间必须在当前时间之后！");
                }
            } catch (Exception e) {
                System.out.println("日期时间格式错误，请重新输入！");
                continue;
            }
            
            System.out.print("是否继续创建？（y/n）");
            option = scanner.nextLine();
            
        } while (option.toLowerCase().equals("y"));
    }

    // 展示日程安排
    public static void showSchedule() {
        if (num == 0) {
            System.out.println("暂无日程安排！");
            return;
        }
        
        // 对数组进行冒泡排序，实现按照日程时间由近及远排序
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (schedules[j] != null && schedules[j + 1] != null &&
                    schedules[j].getDateTime().isAfter(schedules[j + 1].getDateTime())) {
                    Schedule temp = schedules[j];
                    schedules[j] = schedules[j + 1];
                    schedules[j + 1] = temp;
                }
            }
        }
        
        System.out.println("日程标题\t\t日期\t\t时间\t\t距离现在\t\t创建时间");
        System.out.println("================================================================");
        
        for (int i = 0; i < num; i++) {
            if (schedules[i] != null) {
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime dateTime = schedules[i].getDateTime();
                Duration duration = Duration.between(now, dateTime);
                
                long days = duration.toDays();
                long hours = duration.toHours() % 24;
                long minutes = duration.toMinutes() % 60;
                
                System.out.printf("%-15s\t%s\t%s\t%d天%d小时%d分钟\t%s%n",
                    schedules[i].getTitle(),
                    schedules[i].getDateTime().toLocalDate(),
                    schedules[i].getDateTime().toLocalTime(),
                    days, hours, minutes,
                    now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                );
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n-----------日程安排管理程序----------");
            System.out.println("1.创建日程安排 2.查看日程安排 3.退出程序");
            System.out.print("请输入操作编号：");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // 消费换行符
            
            switch (choice) {
                case 1:
                    addSchedules();
                    break;
                case 2:
                    showSchedule();
                    break;
                case 3:
                    System.out.println("程序已退出，再见！");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效选项，请重新输入！");
            }
        }
    }
}