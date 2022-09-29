package com.company;

public class Main {

    public static void main(String[] args) {

        try {
            int [] sayilar= new int[]{1,3,5,7,9};
            System.out.println(sayilar[2]);

        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }

        finally {
            System.out.println("Ne olursa olsun ben En son çalışacağım");
        }

    }
}
