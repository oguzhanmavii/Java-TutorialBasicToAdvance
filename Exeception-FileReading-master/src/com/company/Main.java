package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BufferedReader reader= null;

        int toplam=0;

        try {
            reader = new BufferedReader(new FileReader("C:\\JavaLearning1\\ExeceptionReadingFile-JAVA\\src\\com\\company\\sayilar.txt"));
            String satir= null;

            while ((satir=reader.readLine())!=null)
            {
                toplam+=Integer.valueOf(satir);
            }
            System.out.println("Toplam="+toplam);
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        finally {
            try {
                reader.close();
            }
            catch (Exception exception)
            {

            }
        }

        }
    }
