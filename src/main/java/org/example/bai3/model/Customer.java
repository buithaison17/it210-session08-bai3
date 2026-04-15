package org.example.bai3.model;

import org.example.bai3.annotation.MultipleOfTenThousand;

public class Customer {
    private String customerName;
    @MultipleOfTenThousand(message = "Phải là bội số của 10000")
    private Double balance;

    public Customer() {
    }

    public Customer(String customerName, Double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
