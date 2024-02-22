package com.company;
class HiWithOutThread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi!");
        }
    }
}
class HelloWithOutThread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello!");
        }
    }
}
class HiWithExtends extends Thread {
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
class HelloWithExtends extends Thread {
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

public class ThreadDemoWithExtends {
    public static void main(String[] args) throws InterruptedException {
        HiWithOutThread hiWithOutThread = new HiWithOutThread();
        HelloWithOutThread helloWithOutThread = new HelloWithOutThread();
        HiWithExtends hiWithExtends = new HiWithExtends();
        HelloWithExtends helloWithExtends = new HelloWithExtends();

//        hiWithOutThread.run();
//        Thread.sleep(10);
//        helloWithOutThread.run();

        hiWithExtends.start();
//        Thread.sleep(10);
        helloWithExtends.start();
    }
}
