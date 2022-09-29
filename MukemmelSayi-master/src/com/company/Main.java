package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        int sayi,toplam=0;
        System.out.print("Sayiyi Giriniz:");
        sayi=giris.nextInt();
        System.out.println(sayi);

        for (int i=1; i<sayi;i++)
        {
            if (sayi %i ==0)
            {
                toplam+=i;
            }
        }

        if (toplam== sayi)
        {
            System.out.println("Bu bir mükemmel sayidir");
        }
        else
        {
            System.out.println(("Bu bir mükemmel sayi değildir"));
        }
    }
}
