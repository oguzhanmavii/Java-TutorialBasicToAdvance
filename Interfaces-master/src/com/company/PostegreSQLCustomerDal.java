package com.company;

public class PostegreSQLCustomerDal implements ICustomerDal,IRepository {
    @Override
    public void Add() {
        System.out.println("PostergSQL Eklendi");
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
