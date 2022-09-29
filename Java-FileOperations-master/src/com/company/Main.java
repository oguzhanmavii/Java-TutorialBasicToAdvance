package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        File  file = new File("C:\\JavaLearning1\\students.txt");

        try
        {
            if(file.createNewFile())  //dosya üretme fonksiyonu
            {
              System.out.println("Dosya oluşturuldu");
            }
            else
            {
                System.out.println("Dosya zaten mevcut ;)");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
