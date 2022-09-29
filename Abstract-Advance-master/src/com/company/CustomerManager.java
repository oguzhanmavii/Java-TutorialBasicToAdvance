package com.company;

public class CustomerManager {

    DatabaseManager databaseManager;

    public void getCustomerManager()
    {
        databaseManager.Ekle();
        databaseManager.Guncelle();
        databaseManager.Sil();
    }
}
