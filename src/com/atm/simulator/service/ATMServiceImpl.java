package com.atm.simulator.service;

import com.atm.simulator.model.Account;
import com.atm.simulator.model.Transaction;
import com.atm.simulator.model.User;
import java.util.List;

public class ATMServiceImpl implements ATMService {
    @Override
    public boolean authenticate(User user, String pin) {
        return user.validatePin(pin);
    }

    @Override
    public double checkBalance(Account account) {
        return account.getBalance();
    }

    @Override
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    @Override
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    @Override
    public void transfer(Account fromAccount, Account toAccount, double amount) {
        fromAccount.transfer(toAccount, amount);
    }

    @Override
    public List<Transaction> getTransactionHistory(Account account) {
        return account.getTransactionHistory();
    }
}