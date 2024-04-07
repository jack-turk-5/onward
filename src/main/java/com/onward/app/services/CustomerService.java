package com.onward.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onward.app.entities.Customer;
import com.onward.app.repositories.CustomerRepository;;
/*The author of the file: Vinh Huynh */
@Service
public class CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer emp){
        return customerRepository.save(emp);
    }
    


}