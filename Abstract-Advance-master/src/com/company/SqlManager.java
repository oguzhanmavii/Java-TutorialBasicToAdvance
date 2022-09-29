package com.company;

public class SqlManager extends DatabaseManager{
    @Override
    public void Ekle() {
        System.out.println("Sql Database e Eklendi.");
    }

    @Override
    public void Sil() {
        System.out.println("Sql Database den Silindi.");
    }

    @Override
    public void Guncelle() {
        System.out.println("Sql Database de Guncellendi.");
    }
}
