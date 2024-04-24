package com.onward.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onward.app.entities.Employee;

// Made by Jack Turk
@Repository
public interface EmployeeRepositroy extends CrudRepository<Employee, Long> {
}
