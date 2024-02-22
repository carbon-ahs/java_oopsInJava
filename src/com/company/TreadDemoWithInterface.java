package com.company;
class HiWithInterface implements Runnable {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class HelloWithInterface implements Runnable {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class TreadDemoWithInterface {
    public static void main(String[] args) {
        Runnable hi = new HiWithInterface();
        Runnable hello = new HelloWithInterface();

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }

}
