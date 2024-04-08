package com.onward.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*This file is create and edite by Vinh Huynh */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private String name;
    private String role;
    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
}
