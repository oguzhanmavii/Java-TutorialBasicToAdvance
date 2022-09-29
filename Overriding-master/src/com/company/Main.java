package com.company;

public class Main {

    public static void main(String[] args) {

       BaseKrediManager [] krediManager= new BaseKrediManager[]{new TarimKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};

       for (BaseKrediManager krediManagers:krediManager)
       {
          System.out.println(krediManagers.hesapla(1500));
       }

    }
}
