package com.company;

public class Main {

    public static void main(String[] args) {
	// Repository deseni yüzde 90 veritabani için kullanilir

     Validator validator= new Validator();
     Customer customer= new Customer();
     validator.validate(customer);

    }
}
