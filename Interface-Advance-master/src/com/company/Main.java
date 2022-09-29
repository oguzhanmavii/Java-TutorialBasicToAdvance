package com.company;

public class Main {

    public static void main(String[] args) {

        PersonelManager personelManager= new PersonelManager(new Worker());
        personelManager.work();

    }
}
