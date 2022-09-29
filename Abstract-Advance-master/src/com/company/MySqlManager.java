package com.company;

public class MySqlManager extends DatabaseManager{
    @Override
    public void Ekle() {
        System.out.println("MySQL Database e Eklendi.");
    }

    @Override
    public void Sil() {
        System.out.println("MySQL Database den Silindi.");
    }

    @Override
    public void Guncelle() {
        System.out.println("MySQL Database de Guncellendi.");
    }
}
