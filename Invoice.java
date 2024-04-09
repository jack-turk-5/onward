package com.onward.app.repositories;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
//Coded By Ruben Macedo for ticket 5: Invoices

@Data
public class Invoice {
    private Long id;
    private String customer;
    private List<String> employees;
    private List<String> items;
    private LocalDate date;
    private String invoiceNumber;
    private String misc;
}
