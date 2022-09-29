package com.company;

public class FileLogger extends  BaseLogger{
    public void log(String message)
    {
        System.out.println("File to Logger"+message);
    }
}
