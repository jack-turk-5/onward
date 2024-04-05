package com.onward.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onward.app.entities.Customer;
/*Cre(CustomerRepository.java) Author of the file and code:  */

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
