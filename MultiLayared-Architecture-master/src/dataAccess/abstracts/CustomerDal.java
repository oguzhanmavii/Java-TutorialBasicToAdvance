package dataAccess.abstracts;

import entities.concretes.Customer;

import java.util.List;

public interface CustomerDal
{
      void add(Customer customer);
      void update(Customer customer);
      void  delete(Customer customer);
      boolean getEmail(String email);
      boolean getPassword(String password);
      List<Customer> getAll();


}
