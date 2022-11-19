package com.itheima.java.Date;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class Date1 {
    @Test
    public void sdf(){
        Date date = new Date();

        System.out.println(date.toString());//Tue Nov 01 15:59:48 CST 2022

        System.out.println(date.getTime());//1667289588358


    }
}
