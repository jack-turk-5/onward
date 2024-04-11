package com.onward.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onward.app.entities.Employee;
import com.onward.app.repositories.EmployeeRepositroy;

// Made by Jack Turk
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepositroy employeeRepositroy;

    public Employee saveEmployee(Employee emp){
        return employeeRepositroy.save(emp);
    }

    public List<Employee> fetchEmployees(){
        return (List<Employee>) employeeRepositroy.findAll();
    }

    public Employee updateEmployee(Employee emp){
        Employee db = employeeRepositroy.findById(emp.getId()).get();
        
        if(emp.getName() != db.getName()){
            emp.setName(db.getName());
        }

        if(emp.getRole() != db.getRole()){
            emp.setRole(db.getRole());
        }

        return employeeRepositroy.save(emp);
    }

    public void deleteEmployeeById(Long id){
        employeeRepositroy.deleteById(id);
    }

}
