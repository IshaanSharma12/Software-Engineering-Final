package com.example.ishaanfinal.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "salesman")
public class Salesman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "item")
    private String item;

    @Column(name = "amount")
    private double amount;

    @Column(name = "dot")
    private LocalDate dateOfTransaction;

    // Constructors

    public Salesman() {
        // Default constructor
    }

    public Salesman(String name, String item, double amount, LocalDate dateOfTransaction) {
        this.name = name;
        this.item = item;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(LocalDate dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
}
