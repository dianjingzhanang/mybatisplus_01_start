package com.itheima.java;

public class Number implements Runnable{
    private int number=1;
    @Override
    public void run() {
        while(true){
            synchronized (this){

                notify();

                if(number<=100){
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    break;
                }

            }
        }

    }
}
