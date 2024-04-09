// Author: Loc Ha
package com.onward.app.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onward.app.entities.LineItem;
import com.onward.app.repositories.LineItemRepository;

import java.util.List;

/**
 * LineItemService class that serves as the service layer for business logic,
 * interacting with the LineItemRepository.
 */
@Service
public class LineItemService 
{
    @Autowired
    private LineItemRepository repository;

    // Retrieves all line items from the database
    public List<LineItem> listAll() 
    {
        return repository.findAll();
    }
    
    // Saves a line item to the database
    public LineItem save(LineItem lineItem) 
    {
        return repository.save(lineItem);
    }
}
