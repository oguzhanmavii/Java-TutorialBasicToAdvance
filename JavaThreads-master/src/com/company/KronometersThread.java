package com.company;

public class KronometersThread implements Runnable {

    private  Thread thread;
    private  String threadName;

    public KronometersThread(String threadName)
    {
        this.threadName= threadName;
        System.out.println("Oluşturuluyor "+threadName);
    }

    @Override
    public void run() {

        System.out.println("Çalıştırılıyor :"+threadName);

        for (int i=1; i<=10;i++)
        {
            System.out.println(threadName+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.println("Kesildi :"+threadName);
            }
        }

        System.out.println("Thread bitti :"+threadName);
    }



    public  void Start()
    {
        System.out.println("Thread Nesnesi Oluşturuluyor..");


        if (thread == null)
        {
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
