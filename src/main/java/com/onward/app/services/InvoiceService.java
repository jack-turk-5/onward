package com.onward.app.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onward.app.entities.Invoice;
import com.onward.app.repositories.InvoiceRepository;
import java.util.List;
//Coded By Ruben Macedo for ticket 5: Invoices

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;
    //Grab all Invoices
    public List<Invoice> getAllInvoices() {
        return (List<Invoice>) invoiceRepository.findAll();
    }
    //Delete Invoice by ID
    public void deleteInoviceByID(Long id){
        invoiceRepository.deleteById(id);
    }

    //Need inovice update info
    public static Invoice updateInvoice(Invoice invoice) {
    //Find the Customer information
    // Invoice NN = invoiceRepository.findById(invoice.getId()).get();

       /*  //Update name
        Invoice existingInvoice = invoiceRepository.findById(invoice.getId());
        if (invoice.getCustomer() != null) {
            existingInvoice.setCustomer(invoice.getCustomer());
        }
        
        // Check and update employees
        if (invoice.getEmployees() != null) {
            existingInvoice.setEmployees(invoice.getEmployees());
        }
        
        // Check and update items
        if (invoice.getItems() != null) {
            existingInvoice.setItems(invoice.getItems());
        }
        
        // Check and update date
        if (invoice.getDate() != null) {
            existingInvoice.setDate(invoice.getDate());
        }
        
        // Check and update invoice number
        if (invoice.getInvoiceNumber() != null) {
            existingInvoice.setInvoiceNumber(invoice.getInvoiceNumber());
        }
        
        // Check and update miscellaneous
        if (invoice.getMisc() != null) {
            existingInvoice.setMisc(invoice.getMisc());
        }
        
        // Save the updated invoice
        return invoiceRepository.save(existingInvoice);
        */
        return null;
    }
}
