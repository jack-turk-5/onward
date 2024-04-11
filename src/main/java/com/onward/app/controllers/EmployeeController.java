package com.onward.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.onward.app.entities.Employee;
import com.onward.app.services.EmployeeService;

// Made by Jack Turk
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create
    @PostMapping(value = "/employees", consumes = "application/json")
    @CrossOrigin
    public Employee addEmployee(@RequestBody Employee emp){
        return employeeService.saveEmployee(emp);
    }

    // Read
    @GetMapping("/employees")
    public List<Employee> fetchEmployees(){
        return employeeService.fetchEmployees();
    }

}
