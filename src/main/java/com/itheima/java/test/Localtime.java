package com.itheima.java.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Localtime {
    public static void main(String[] args) {
        //now;获取当前的日期，时间，日期+时间
        LocalDateTime now = LocalDateTime.now();//日期+时间
        LocalTime now1 = LocalTime.now();
        LocalDate now2 = LocalDate.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        //of();设置指定的年，月，日，时，分，秒没有偏移量
        LocalDateTime of = LocalDateTime.of(2020, 10, 13, 4, 3);
        System.out.println(of);

        //getXxx
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getMinute());

        //不可变性
        LocalDateTime localDateTime = now.withDayOfMonth(22);
        System.out.println(now);
        System.out.println(localDateTime);

    }
}
