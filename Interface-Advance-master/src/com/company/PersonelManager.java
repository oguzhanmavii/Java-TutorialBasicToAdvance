package com.company;

public class PersonelManager {

   private IWorkable workable;
   private IEatable  eatable;
    private IPayable payable;

    public  PersonelManager(IWorkable workable)
    {

        this.workable=workable;
        this.eatable=eatable;
        this.payable=payable;

    }

    public void work()
    {
        // İş Kodları yani PersonelManager'da yazılır..!
        workable.work();
    }

    public void eat()
    {
        // İş Kodları yani PersonelManager'da yazılır..!
        eatable.eat();
    }

    public void pay()
    {
        // İş Kodları yani PersonelManager'da yazılır..!
        payable.pay();
    }

}
