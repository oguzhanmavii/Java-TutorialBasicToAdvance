package com.company;

public class Kurs {

    private int id;
    private String ad;
    private  String aciklama;
    private int egitmenİd;


    public  Kurs(int id,String ad,String aciklama,int egitmenİd)
    {
        this.id=id;
        this.ad=ad;
        this.aciklama=aciklama;
        this.egitmenİd=egitmenİd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEgitmenİd() {
        return egitmenİd;
    }

    public void setEgitmenİd(int egitmenİd) {
        this.egitmenİd = egitmenİd;
    }

    public String getAd()
    {
        return  ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
