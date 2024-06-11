package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.math.BigDecimal;
@MappedSuperclass//don't created table , just provide information for other class tables
public class Account {
    @Id
    private  Long id;
    private String owner;
    private BigDecimal balance;
    private  BigDecimal interestRate;
}
