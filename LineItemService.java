// Author: Loc Ha
package com.onward.app.LineItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.onward.LineItem.LineItemRepository;

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
