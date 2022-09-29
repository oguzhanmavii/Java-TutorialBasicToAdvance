package business.concretes;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerCheckManager implements CustomerCheckService {

    List<String> listOfEmail = new ArrayList<String>();


    @Override
    public boolean checkFirstName(Customer customer) {
        return false;
    }

    @Override
    public boolean checkLastName(Customer customer) {
        return false;
    }

    @Override
    public boolean checkEmail(Customer customer) {
        return false;
    }

    @Override
    public boolean checkPassword(Customer customer) {
        return false;
    }

    @Override
    public boolean uniqueEmail(Customer customer) {
        return false;
    }

    @Override
    public boolean İsValid(Customer customer) {
        return false;
    }

}
