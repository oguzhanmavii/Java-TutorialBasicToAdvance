package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] sayilar = {5,8,99,9,88};
        int max=1;

        for (int i=0; i<sayilar.length;i++)
        {
            if (sayilar[i]<max)
            {
                sayilar[i] =max;
            }
            else
            {
                max =sayilar[i];
            }
        }

        System.out.println(max);

    }
}
