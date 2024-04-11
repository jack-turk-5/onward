package com.onward.app.entities;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

//CODED BY VINCENT YU

@RunWith(SpringRunner.class)
@DataJpaTest
public class EntityTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private LineItemRepository lineItemRepository;

    @Test
    public void testCustomerEntity() {
        // Create a new Customer entity
        Customer customer = new Customer("John Doe", "Admin");

        // Save the entity to the database
        Customer savedCustomer = customerRepository.save(customer);

        // Retrieve the entity from the database
        Customer retrievedCustomer = customerRepository.findById(savedCustomer.getId()).orElse(null);

        // Verify that the retrieved entity matches the saved entity
        assertEquals("John Doe", retrievedCustomer.getName());
        assertEquals("Admin", retrievedCustomer.getRole());
    }

    @Test
    public void testEmployeeEntity() {
        // Create a new Employee entity
        Employee employee = new Employee("Alice Smith", "Manager");

        // Save the entity to the database
        Employee savedEmployee = employeeRepository.save(employee);

        // Retrieve the entity from the database
        Employee retrievedEmployee = employeeRepository.findById(savedEmployee.getId()).orElse(null);

        // Verify that the retrieved entity matches the saved entity
        assertEquals("Alice Smith", retrievedEmployee.getName());
        assertEquals("Manager", retrievedEmployee.getRole());
    }

    @Test
    public void testInvoiceEntity() {
        // Create a new Invoice entity
        List<String> employees = Arrays.asList("Alice", "Bob");
        List<String> items = Arrays.asList("Item1", "Item2");
        Invoice invoice = new Invoice("Customer1", employees, items, LocalDate.now(), "INV123", "Miscellaneous");

        // Save the entity to the database
        Invoice savedInvoice = invoiceRepository.save(invoice);

        // Retrieve the entity from the database
        Invoice retrievedInvoice = invoiceRepository.findById(savedInvoice.getId()).orElse(null);

        // Verify that the retrieved entity matches the saved entity
        assertEquals("Customer1", retrievedInvoice.getCustomer());
        assertEquals(employees, retrievedInvoice.getEmployees());
        assertEquals(items, retrievedInvoice.getItems());
        assertEquals(LocalDate.now(), retrievedInvoice.getDate());
        assertEquals("INV123", retrievedInvoice.getInvoiceNumber());
        assertEquals("Miscellaneous", retrievedInvoice.getMisc());
    }

    @Test
    public void testLineItemEntity() {
        // Create a new LineItem entity
        LineItem lineItem = new LineItem(null, "Item1", 2, "Description1", 10.5);

        // Save the entity to the database
        LineItem savedLineItem = lineItemRepository.save(lineItem);

        // Retrieve the entity from the database
        LineItem retrievedLineItem = lineItemRepository.findById(savedLineItem.getId()).orElse(null);

        // Verify that the retrieved entity matches the saved entity
        assertEquals("Item1", retrievedLineItem.getName());
        assertEquals(2, retrievedLineItem.getQuantity());
        assertEquals("Description1", retrievedLineItem.getDescription());
        assertEquals(10.5, retrievedLineItem.getPrice(), 0.001); // Using delta for double comparison
    }
}
