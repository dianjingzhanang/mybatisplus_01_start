package com.itheima.java.String;

public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuffer sb2=new StringBuffer("abc");//char[] value=new char["abc".length+16];底层创建了一个长度为length+16的char型数组
        System.out.println(sb2);

        A a = new A();
        System.out.println(a);
    }
}
