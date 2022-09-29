package com.company;

public class OracleCustomerDal implements ICustomerDal,IRepository {
    @Override
    public void Add() {
        System.out.println("Oracle Eklendi");
    }

    @Override
    public void Delete() {
        System.out.println("Oracle Silindi");
    }

    @Override
    public void Update() {
        System.out.println("Oracle Güncellendi");
    }
}
