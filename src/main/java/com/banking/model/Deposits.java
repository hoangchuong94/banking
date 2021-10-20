package com.banking.model;

import javax.persistence.*;

@Entity
@Table(name = "deposits")
public class Deposits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double transaction;

    @ManyToOne
    @JoinColumn(name = "customerId")
    Customer customer;

    public Deposits() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTransaction() {
        return transaction;
    }

    public void setTransaction(Double transaction) {
        this.transaction = transaction;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
