package com.company;

public class Egitmen
{
    private  int id;
    private  String ad;


    public Egitmen(int id,String ad)
    {
        this.id= id;
        this.ad=ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
