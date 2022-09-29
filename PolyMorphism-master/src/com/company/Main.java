package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger()};


        for (BaseLogger logger:loggers)
        {
            logger.log("Log Mesajı");
        }


    }
}
