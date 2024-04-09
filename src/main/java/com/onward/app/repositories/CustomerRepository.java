package com.onward.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onward.app.entities.Customer;
/* (CustomerRepository.java) Author of the file and code: Vinh Huynh(issue #4) 
 * This file is a a mapping repo to a list of customer
 * Crud : create, read, updated, and delete
*/
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
