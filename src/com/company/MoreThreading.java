package com.company;

public class MoreThreading {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hi!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }});

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

        System.out.println(t1.isAlive()); // shows this thread running or not. returns true/false

        t2.setName("Hello Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.join(); // wait to finish t1 and join with main thread
        t2.join();

        System.out.println("Bye");
    }
}
