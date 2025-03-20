package com.atm.simulator.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;       // Unique account identifier
    private double balance;             // Current balance
    private List<Transaction> transactionHistory; // Record of transactions

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        balance -= amount;
        transactionHistory.add(new Transaction("Withdrawal", amount));
    }

    public void transfer(Account toAccount, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        this.withdraw(amount);
        toAccount.deposit(amount);
        transactionHistory.add(new Transaction("Transfer to: " + toAccount.getAccountNumber(), amount));
    }

    public List<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactionHistory);
    }
}