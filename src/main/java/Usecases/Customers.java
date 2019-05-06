package Usecases;

import Entities.Customer;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Model
public class Customers implements Serializable {

    private List<Customer> allCustomers;

    @PostConstruct
    public void init(){
        loadCustomers();
    }

    public void loadCustomers(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Jack", "Johnson", "78542146"));
        customers.add(new Customer("Tim", "Jackson", "77777"));
        customers.add(new Customer("George", "Martis", "7548951254"));
        this.allCustomers = customers;
    }

    public List<Customer> getAllCustomers(){
        return allCustomers;
    }
}
