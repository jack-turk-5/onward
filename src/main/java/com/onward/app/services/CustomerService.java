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
        if(cus.getCompany() != db.getCompany()){
            cus.setCompany(db.getCompany());
        }
        //Update role
        if(cus.getContactPerson() != db.getContactPerson()){
            cus.setContactPerson(db.getContactPerson());
        }
        return customerRepository.save(cus);
    }
    //Delete customer
    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }

}