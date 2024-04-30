package com.onward.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
   
    /*This file is create and edit by Vinh Huynh (issue #4)
    * This class will act a Datatype to specifiy customer and their level of access
    */
    private String company;    //Name of the Customer
    private String contactPerson;    //role of the Customer
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // this will act as ID
}
