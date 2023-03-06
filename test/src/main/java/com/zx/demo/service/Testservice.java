package com.zx.demo.service;

/**
 * @author zx
 * @date 2023/3/1 18:04
 */
public class Testservice {

    public static void main(String[] args){
        Thread aa = new Thread(()->{
            System.out.println(Thread.currentThread().getName() +"::"+ Thread.currentThread().isDaemon());
            while(true){ }
        }, "aa");
        aa.setDaemon(true);
        aa.start();
        System.out.println(Thread.currentThread().getName()+"over");
/*        new Thread(()->{
            System.out.println(Thread.currentThread().getName() +"::"+ Thread.currentThread().isDaemon());
            while(true){ }
        }, "aa").start();
        System.out.println(Thread.currentThread().getName()+"over");*/
    }
}
