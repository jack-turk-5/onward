package com.onward.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onward.app.entities.Customer;
import com.onward.app.repositories.CustomerRepository;;
/*The author of the file: Vinh Huynh (issue #4) */
@Service
public class CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    //save Customer instance
    public Customer saveCustomer(Customer cus){
        return customerRepository.save(cus);
    }
    //get a list of Customer
    public List<Customer> fetchCustomer(){
        return (List<Customer>) customerRepository.findAll();
    }
    
    public Customer updateCustomer(Customer cus){
        //find the Customer information
        Customer db = customerRepository.findById(cus.getId()).get();
        //update name
        if(cus.getName() != db.getName()){
            cus.setName(db.getName());
        }
        //update Role
        if(cus.getRole() != db.getRole()){
            cus.setRole(db.getRole());
        }
        return customerRepository.save(cus);
    }
    //delete: Customer
    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }

}