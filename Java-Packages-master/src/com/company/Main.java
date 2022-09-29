package com.company;
import java.util.Scanner;
import mathematics.maths;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi giriniz:");
        String isim;

        isim= scanner.nextLine();

        System.out.println("Adınız :"+isim);

         maths maths= new maths();

         maths.Plus(5,9);
         maths.Minus(5,9);
         maths.Multiply(5,9);
         maths.Divided(5,9);


    }
}
