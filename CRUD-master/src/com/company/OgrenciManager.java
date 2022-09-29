package com.company;

public class OgrenciManager{

    public  void ogrenciEkle(Ogrenci ogrenci)
    {
        System.out.println("------------------------------------");
        System.out.println("Öğrencinin idsi :"+ogrenci.getId());
        System.out.println("Öğrencinin Adı :"+ogrenci.getAd());
        System.out.println("Öğrencinin Soyadi :"+ogrenci.getSoyad());
        System.out.println("Öğrencinin emaili :"+ogrenci.getEmail());
        System.out.println("Öğrenci Bilgileri Sisteme Kaydedildi..");
    }

    public  void ogrenciSil(Ogrenci ogrenci)
    {
        System.out.println("------------------------------------");
        System.out.println("Öğrencinin idsi :"+ogrenci.getId());
        System.out.println("Öğrencinin Adı :"+ogrenci.getAd());
        System.out.println("Öğrencinin Soyadi :"+ogrenci.getSoyad());
        System.out.println("Öğrencinin emaili :"+ogrenci.getEmail());
        System.out.println("Öğrenci Bilgileri Sistemeden Silindi..");
    }
    public  void ogrenciGüncelle(Ogrenci ogrenci)
    {
        System.out.println("------------------------------------");
        System.out.println("Öğrencinin idsi :"+ogrenci.getId());
        System.out.println("Öğrencinin Adı :"+ogrenci.getAd());
        System.out.println("Öğrencinin Soyadi :"+ogrenci.getSoyad());
        System.out.println("Öğrencinin emaili :"+ogrenci.getEmail());
        System.out.println("Öğrenci Bilgileri Sistemde Güncellendi..");
    }

}
