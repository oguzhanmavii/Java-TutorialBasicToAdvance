package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();

    }



 /*   public  static void createFile() // Dosya Oluşturma işlemi
    {
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
    */

    public  static  void  getFileInfo() //Oluşturulan Dosyanın gerekli verilerine erişebilme
    {
        File  file = new File("C:\\JavaLearning1\\students.txt");
        if (file.exists())
        {
            System.out.println("Dosya adı :"+file.getName());
            System.out.println("Dosya yolu :"+file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi ? :"+file.canWrite());
            System.out.println("Dosya Okunabilir  mi ? :"+file.canRead());
            System.out.println("Dosya boyutu :"+file.length()+" byte");

        }
    }

    public  static  void  readFile()
    {
        File  file = new File("C:\\JavaLearning1\\students.txt");

        try
        {
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine())
            {
                String line = myReader.nextLine();
                System.out.println(line);
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public  static  void  writeFile()
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\JavaLearning1\\students.txt",true));
            writer.newLine();
            writer.write("Bilkent Üniversitesi");
            System.out.println("Dosya Sisteme yazıldı");
            writer.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
