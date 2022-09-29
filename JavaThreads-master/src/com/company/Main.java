package com.company;

public class Main {

    public static void main(String[] args) {

        KronometersThread thread1= new KronometersThread(("thread1"));

        KronometersThread thread2= new KronometersThread("thread2");

        KronometersThread thread3= new KronometersThread("thread3");



        thread1.Start();
        thread2.Start();
        thread3.Start();


    }
}
