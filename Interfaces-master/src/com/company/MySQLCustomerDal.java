package com.company;

public class MySQLCustomerDal implements ICustomerDal,IRepository {
    @Override
    public void Add() {
        System.out.println("MySQL Eklendi");
    }

    @Override
    public void Delete() {
        System.out.println("MySQL Silindi");
    }

    @Override
    public void Update() {
        System.out.println("MySQL Güncellendi");
    }
}
