package com.atm.simulator.model;

import java.time.LocalDateTime;

public class Transaction {
    private String type;         // Deposit, Withdrawal, Transfer
    private double amount;       // Transaction amount
    private LocalDateTime timestamp; // When it occurred

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return timestamp + " - " + type + ": " + amount;
    }
}