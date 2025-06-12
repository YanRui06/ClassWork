package com.apiCLass.Class250605.Study250609;

import java.time.LocalDate;

public class test01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate of = LocalDate.of(2023, 11, 20);
        System.out.println("当前日期now:" + now);
        System.out.println("指定日期now:" + of);
        System.out.println("1. LocalDate类中的获取方法------------");
        System.out.println("当前的年份：" + now.getYear());
        System.out.println("当前的月份：" + now.getMonth());
        System.out.println("当前为本月的第几天：" + now.getDayOfMonth());
        System.out.println("2.LocalDate类中的判断方法-------------");
        System.out.println("日期of是否在now之前：" + of.isBefore(now));
        System.out.println("日期of是否在now之后：" + of.isAfter(now));
        System.out.println("日期of是否与now相等：" + of.isEqual(now));
        System.out.println("日期of是否为闰年：" + of.isLeapYear());
        System.out.println("3.LocaleDate类中的解析以及加减操作方法---");
        String dateStr = "2023-11-11";
        System.out.println("把日期字符解析成日期对象的结果为" + LocalDate.parse(dateStr));
        System.out.println("把now的年份加1的后果为" + now.plusYears(1));
        System.out.println("将now的天数减十的后果为" + now.minusDays(10));
        System.out.println("将now的年份设置为2022的后果为" + now.withYear(2022));
    }
}
