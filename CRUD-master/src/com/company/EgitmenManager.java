package com.company;

public class EgitmenManager
{
    public void egitmenEkle(Egitmen egitmen)
    {
        System.out.println("------------------------------------");
        System.out.println("Eğitmen idsi :"+egitmen.getId());
        System.out.println("Eğitmenin Adi :"+egitmen.getAd());
        System.out.println("Eğitmen Bilgileri Başarı ile Kaydedildi");
    }
    public void egitmenSil(Egitmen egitmen)
    {
        System.out.println("------------------------------------");
        System.out.println("Eğitmen idsi :"+egitmen.getId());
        System.out.println("Eğitmenin Adi :"+egitmen.getAd());
        System.out.println("Eğitmen Bilgileri Başarı ile Silindi");
    }
    public void egitmenGuncelle(Egitmen egitmen)
    {
        System.out.println("------------------------------------");
        System.out.println("Eğitmen idsi :"+egitmen.getId());
        System.out.println("Eğitmenin Adi :"+egitmen.getAd());
        System.out.println("Eğitmen Bilgileri Başarı ile Güncellendi");
    }
}
