package com.zx.demo.service;

/**
 * @author zx
 * @date 2023/
 */
public class ThreadDemo {
    public static void main (String[] args){
        Share share = new Share();
        new Thread(()->{
            try {
                for(int i = 0; i<10;i++){
                    share.incr();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AA").start();
        new Thread(()->{
            try {
                for(int i = 0; i<10;i++){
                    share.decr();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"BB").start();
    }
}

class Share {
    private int number = 0;
    public synchronized void incr() throws InterruptedException{
        if(number != 0){
            this.wait();
        }
        number ++;
        System.out.println(Thread.currentThread().getName()+"::"+number);
        this.notifyAll();
    }
    public synchronized void decr() throws InterruptedException{
        if(number != 1){
            this.wait();
        }
        number --;
        System.out.println(Thread.currentThread().getName()+"::"+number);
        this.notifyAll();
    }
}
