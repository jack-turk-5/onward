package com.onward.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.onward.app.entities.Customer;
import com.onward.app.services.CustomerService;
/*This file is created  edited by Vinh Huynh */
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    //Create
    @PostMapping(value = "/customers", consumes = "application/json")
    @CrossOrigin
    //Add customer 
    public Customer addCustomer(@RequestBody Customer cus){
        return customerService.saveCustomer(cus);
    }

    //Read
    @GetMapping("/customers")
    public List<Customer> fetchCustomer(){
        return customerService.fetchCustomer();
    }
}
