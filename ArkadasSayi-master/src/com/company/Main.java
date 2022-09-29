package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sayi= new Scanner(System.in);

        int s1,s2,t1=0,t2=0;

         System.out.println("1.sayiyi giriniz:");
         s1 = sayi.nextInt();
         System.out.println("2.sayiyi giriniz:");
         s2 = sayi.nextInt();
        for (int i=1; i<s1;i++)
        {
            if (s1%i==0)
            {
                t1+=i;
            }
        }

        for (int j=1; j<s2;j++)
        {
            if (s2%j==0)
            {
                t2+=j;
            }
        }

        if (s1==t2 && s2 == t1)
        {
            System.out.println("Bu iki sayi birbirinin arkadaşıdır");
        }
        else
        {
            System.out.println("Bu iki sayi birbirinin arkadaşi değildir !");
        }
    }
}
