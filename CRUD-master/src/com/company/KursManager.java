package com.company;

public class KursManager {

    public  void kursEkle(Kurs kurs)
    {
        System.out.println("--------------------------------------");
        System.out.println("Kurs oluşturuldu.");
        System.out.println(kurs.getAd()+" Eklendi..");
    }

    public  void  kursSil(Kurs kurs)
    {
        System.out.println("--------------------------------------");
        System.out.println("Kurs Silindi.");
        System.out.println(kurs.getAd()+" Silindi..");
    }

    public  void kursGuncelle(Kurs kurs)
    {
        System.out.println("--------------------------------------");
        System.out.println("Kurs Güncellendi..");
        System.out.println(kurs.getAd()+" Güncellendi..");
    }
}
