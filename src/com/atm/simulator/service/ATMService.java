package com.atm.simulator.service;

import com.atm.simulator.model.Account;
import com.atm.simulator.model.Transaction;
import com.atm.simulator.model.User;
import java.util.List;

public interface ATMService {
    boolean authenticate(User user, String pin);
    double checkBalance(Account account);
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
    void transfer(Account fromAccount, Account toAccount, double amount);
    List<Transaction> getTransactionHistory(Account account);
}