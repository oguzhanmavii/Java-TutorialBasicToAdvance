package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.print("Sayiyi Giriniz :");
        Scanner veriAL= new Scanner(System.in);
        int sayi = veriAL.nextInt();
        int bolen= sayi %2;

        boolean sayiAsalmi = true;

        for (int i=2; i<sayi; i++)
        {
            if (sayi %i== 0)
            {
                sayiAsalmi =false;
            }
        }

        if (sayiAsalmi) // True Döndürüyor.
        {
            System.out.println("Sayi Asaldır.");
        }
        else // False Döndürüyor.
        {
            System.out.println("Sayi Asal Değildir.");
        }

    }
}
