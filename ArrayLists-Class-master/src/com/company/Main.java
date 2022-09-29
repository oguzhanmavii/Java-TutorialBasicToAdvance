package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Customer> customers= new ArrayList<Customer>();

        customers.add(new Customer(1,"Oğuzhan","Mavi"));

        customers.add(new Customer(2,"Engin","Demiroğ"));

        customers.add(new Customer(3,"Hakan","Aytunç"));
        
        for (Customer customer:customers)
        {
            System.out.println(customer.id+"  "+customer.fistName+"  "+customer.lastName);
        }

    }
}
