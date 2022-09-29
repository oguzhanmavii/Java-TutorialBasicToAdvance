package com.company;
import business.concretes.CustomerCheckManager;
import business.concretes.CustomerManager;
import business.concretes.MailVerificationManager;
import dataAccess.concretes.HibernateCustomerDal;
import entities.concretes.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerId(1);
        customer1.setFirstName("Oğuzhan");
        customer1.setLastName("Mavi");
        customer1.setEmail("oguzhanmavii98@gmail.com");
        customer1.setPassword("13579");

        Customer customer2 = new Customer();
        customer2.setCustomerId(2);
        customer2.setFirstName("Tamer");
        customer2.setLastName("Çakır");
        customer2.setEmail("Tamercakr@outlook.com");
        customer2.setPassword("2468");

        Customer customer3 = new Customer();
        customer3.setCustomerId(3);
        customer3.setFirstName("Seyithan");
        customer3.setLastName("Akbulut");
        customer3.setEmail("seyithanakblt@gmail.com");
        customer3.setPassword("37519");

        CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(),new MailVerificationManager(),new HibernateCustomerDal());

        customerManager.signUp(customer1);
        customerManager.signUp(customer2);



    }

}