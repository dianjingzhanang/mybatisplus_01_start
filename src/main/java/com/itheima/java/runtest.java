package com.itheima.java;

public class runtest extends Thread{

        public static void main(String[] args) {
            //3.创建实现类对象
        runnable a=new runnable();
        //4.将此对象作为参数传递到thread类的构造器中，创建thread类对象
            Thread thread = new Thread(a);

            thread.start();

            //再开启一个线程
            Thread thread1 = new Thread(a);

            thread1.start();

        }

}
