package com.company;
class HiWithInterface extends Thread {
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
class HelloWithInterface extends Thread {
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

}
