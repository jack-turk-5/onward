package com.onward.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*This file is create and edit by Vinh Huynh (issue #4)
 * This class will act a Datatype to specifiy customer and their level of access
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    /*Assign role */
    private String name;    //Name of the Customer
    private String role;    //role of the Customer
    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; // this will act as ID
    
}
