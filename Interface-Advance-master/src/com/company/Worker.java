package com.company;

public class Worker implements IWorkable,IEatable,IPayable{
    @Override
    public void work() {
        System.out.println("Personel Çalıştı");
    }

    @Override
    public void eat() {
        System.out.println("Personel yemek yedi");
    }

    @Override
    public void pay() {
        System.out.println("Personel ücretini aldı");
    }
}
