// Author: Loc Ha
package com.onward.app.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onward.app.entities.LineItem;
import com.onward.app.services.LineItemService;

import java.util.List;

/**
 * LineItemController class that exposes LineItem services as RESTful endpoints.
 */
@RestController
@RequestMapping("/api/lineitems")
public class LineItemController 
{
    @Autowired
    private LineItemService lineitemService;

    // Retrieves all line items
    @GetMapping("/lineitem")
    public List<LineItem> getAllLineItems() 
    {
        return lineitemService.listAll();
    }

    // Creates a new line item
    @PostMapping
    public LineItem create(@RequestBody LineItem lineItem) 
    {
        return lineitemService.save(lineItem);
    }
}
