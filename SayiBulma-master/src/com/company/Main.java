package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

    Scanner sayi= new Scanner(System.in);

	int [] sayilar = new int[]{1,2,8,7,9,0};

    boolean durum=false;

	int aranacak_sayi;

	aranacak_sayi=sayi.nextInt();

	for (int i=0; i<6;i++)
    {
        if (aranacak_sayi==sayilar[i])
        {
            durum=true;
        }
    }
	if (durum==true)
    {
        System.out.println("Aranacak sayi dizi içerisinde bulundu.");
    }
	else
    {
        System.out.println("Aranacak sayi dizi içerisinde bulunamadi");
    }
    }
}
