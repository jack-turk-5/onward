package com.onward.app.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.JpaRepository;
import com.onward.app.entities.Invoice;
//Coded By Ruben Macedo for ticket 5: Invoices
@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}