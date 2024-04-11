package com.onward.app.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
//Coded By Ruben Macedo for ticket 5: Invoices

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    
    private String customer;
    private List<String> employees;
    private List<String> items;
    private LocalDate date;
    private String invoiceNumber;
    private String misc;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
