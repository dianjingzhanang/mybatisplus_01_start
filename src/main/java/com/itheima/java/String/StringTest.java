package com.itheima.java.String;


public class StringTest {
    /*String ""
    String 声明为final的，不可被继承
    String实现了Serializable接口，：表示字符串是支持序列化的，就是可以在网络中变成字节来传输
            也实现了Comparable接口，表示String可以比较大小
    3.final char value[];内部储存字符串数据，内部不可变
    * */

    String s1=new String("134");

    public void sdd(String s1){
        s1="456";
    }

    public static void main(String[] args) {

        StringTest b=new StringTest();

        b.sdd(b.s1);//不改变类里面的值s1

        System.out.println(b.s1);
    }
}
