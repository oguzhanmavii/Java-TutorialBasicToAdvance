package com.company;

public class CustomerManager {

    private   ICustomerDal customerDal;

    public  CustomerManager(ICustomerDal customerDal)
    {
        this.customerDal= customerDal;
    }
    public  void  add()
    {
        //İş kodları CustomerManager'da yazılır..!
        customerDal.Add();
    }
}
