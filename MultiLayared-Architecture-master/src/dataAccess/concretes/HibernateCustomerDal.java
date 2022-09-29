package dataAccess.concretes;

import dataAccess.abstracts.CustomerDal;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerDal implements CustomerDal
{

    List<Customer> customers= new ArrayList<Customer>();

    @Override
    public void add(Customer customer) {

        System.out.println("Kullanıcı Eklendi");
        customers.add(customer);
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Kullanıcı güncellendi");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Kullanıcı silindi");
    }

    @Override
    public boolean getEmail(String email) {
        for (Customer customer:customers)
        {
            if (customer.getEmail()==email)
            {
                return  true;
            }
        }
        return false;
    }

    @Override
    public boolean getPassword(String password)
    {
        for (Customer customer:customers)
        {
            if (customer.getPassword()==password)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Customer> getAll()
    {
        return null;
    }
}
