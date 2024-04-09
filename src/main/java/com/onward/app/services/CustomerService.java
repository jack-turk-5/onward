package com.onward.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onward.app.entities.Customer;
import com.onward.app.repositories.CustomerRepository;;
/*The author of the file: Vinh Huynh (issue #4) 
 * This file is will basic funtion for to manage Customer List
*/
@Service
public class CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    //Save Customer instance
    public Customer saveCustomer(Customer cus){
        return customerRepository.save(cus);
    }
    //Get a list of Customer
    public List<Customer> fetchCustomer(){
        return (List<Customer>) customerRepository.findAll();
    }
    
    public Customer updateCustomer(Customer cus){
        //Find the Customer information
        Customer db = customerRepository.findById(cus.getId()).get();
        //Update name
        if(cus.getName() != db.getName()){
            cus.setName(db.getName());
        }
        //Update role
        if(cus.getRole() != db.getRole()){
            cus.setRole(db.getRole());
        }
        return customerRepository.save(cus);
    }
    //Delete customer
    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }

}