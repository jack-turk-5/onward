// Author: Loc Ha
package com.onward.app.LineItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.onward.app.repositories.LineItemRepository;
import com.onward.app.entities.LineItem;

/**
 * LineItemService class that serves as the service layer for business logic,
 * interacting with the LineItemRepository.
 */
@Service
public class LineItemService 
{
    @Autowired
    private LineItemRepository LineItemRepository;

    // Retrieves all line items from the database
    public List<LineItem> listAll() 
    {
        return LineItemRepository.findAll();
    }

    // update
    public LineItem update(LineItem lineItem)
    {
        LineItem data_base = LineItemRepository.findId(lineItem.getId()).get();
        
        // name
        if(lineItem.getName() != data_base.getName())
        {
            lineItem.setName(data_base.getName());
        }

        // quantity
        if(lineItem.getQuantity() != data_base.getQuantity())
        {
            lineItem.setQuantity(data_base.getQuantity());
        }
        // description
        if(lineItem.getDescription() != data_base.getDescription())
        {
            lineItem.setDescription(data_base.getDescription());
        }

        // price
        if(lineItem.getPrice() != data_base.getPrice())
        {
            lineItem.setPrice(data_base.getPrice());
        }

        return LineItemRepository.save(lineItem);
    }
    
    // Saves a line item to the database
    public LineItem saveLI(LineItem lineItem) 
    {
        return LineItemRepository.save(lineItem);
    }

    // delete
    public void remove(Long id)
    {
        LineItemRepository.remove(id);
    }
}
