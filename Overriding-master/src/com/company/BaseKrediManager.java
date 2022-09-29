package com.company;

public class BaseKrediManager {

    public  double hesapla(double tutar)
    {// public final double hesapla şeklinde tanımlarsak diğer managerlarda
      //değişiklik yapmamıza izin vermez çünkü final methodun override edilmesine müsade etmez .
        return tutar*1.18;
    }

}
