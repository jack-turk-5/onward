package com.onward.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onward.app.entities.Customer;
/* (CustomerRepository.java) Author of the file and code: Vinh Huynh(issue #4) */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
