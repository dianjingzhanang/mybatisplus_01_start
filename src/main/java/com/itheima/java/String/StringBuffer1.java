package com.itheima.java.String;

public class StringBuffer1 {
    public static void main(String[] args) {
        String str=new String();//char[] value=new char[0]
        String str1=new String("abc");//char[] valus=new char[]{'a','b','c'}

        StringBuffer sb1=new StringBuffer();//char[] value=new char[16];底层创建了一个长度为16的char型数组
        sb1.append("sdf");
        StringBuffer sb2=new StringBuffer("abc");//char[] value=new char["abc".length+16];底层创建了一个长度为length+16的char型数组

        System.out.println(sb2.length());//输出的是3
    }
}
