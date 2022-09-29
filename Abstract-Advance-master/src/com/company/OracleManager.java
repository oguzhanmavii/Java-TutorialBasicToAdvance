package com.company;

public class OracleManager extends DatabaseManager{
    @Override
    public void Ekle() {
        System.out.println("Oracle Database e Eklendi.");
    }

    @Override
    public void Sil() {
        System.out.println("Oracle Database den Silindi.");
    }

    @Override
    public void Guncelle() {
        System.out.println("Oracle Database de Guncellendi.");
    }
}
