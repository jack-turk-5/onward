package com.onward.app.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onward.app.repositories.Invoice;
import com.onward.app.repositories.InvoiceRepository;
import java.util.List;
//Coded By Ruben Macedo for ticket 5: Invoices

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    // Other service methods for business logic
}
