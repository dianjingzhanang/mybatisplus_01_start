package com.itheima.java.xianchengchi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //2.执行指定的线程的操作，需要提供实现Runnable接口或callable接口实现类对象
        executorService.execute(new NumberThread());//适用于Runnable
        executorService.execute(new NumberThread());

       // executorService.submit(Callable callable);//适用于Callable
        //3.关闭链接池
        executorService.shutdown();
    }
}
