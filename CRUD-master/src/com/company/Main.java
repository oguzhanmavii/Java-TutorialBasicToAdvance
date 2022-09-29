package com.company;

public class Main {

    public static void main(String[] args)
    {
        Kurs egitim1= new Kurs(1,"C#","Bu Eğitim C# ve angular" +
            " üzerine Bir Web geliştirme eğitimidir ayrıca Çok Katmanlı Mimari üzerine" +
            " Temeller Atmak için Hazırlandı.",1);
       Kurs egitim2= new Kurs(2,"Java","Bu Eğitim Java ve React" +
                " üzerine Bir Web geliştirme eğitimidir ayrıca Çok Katmanlı Mimari üzerine" +
                " Temeller Atmak için Hazırlandı.",1);
       Kurs egitim3= new Kurs(3,"Pyhton","Bu eğitim Pyhton ile" +
                "Programlamaya Giriş için Hazırlandı",1);


        KursManager kursManager= new KursManager();
        kursManager.kursEkle(egitim1);

        Ogrenci ogrenci1=new Ogrenci(1,"Oğuzhan","Mavi","oguzhanmavii98@gmail.com");
        Ogrenci ogrenci2=new Ogrenci(2,"Seyithan","Akbulut","seyithanakblt@gmail.com");
        Ogrenci ogrenci3=new Ogrenci(3,"Tamer","Çakır","tamercakr@gmail.com");

        OgrenciManager ogrenciManager = new OgrenciManager();
        ogrenciManager.ogrenciEkle(ogrenci1);

        Egitmen egitmen= new Egitmen(1,"Engin Demiroğ");

        EgitmenManager egitmenManager= new EgitmenManager();
        egitmenManager.egitmenEkle(egitmen);


        kursManager.kursEkle(egitim2);
        ogrenciManager.ogrenciEkle(ogrenci2);
        egitmenManager.egitmenEkle(egitmen);


        kursManager.kursEkle(egitim3);
        ogrenciManager.ogrenciEkle(ogrenci3);
        egitmenManager.egitmenEkle(egitmen);


    }
}
