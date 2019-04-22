package com.durgosh.card.model;

import com.durgosh.card.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    String ownerName;
    String id;
    double balance;

    @Autowired
    TransactionRepository transactions; // why do we need rep and service for Transaction ???

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public TransactionRepository getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "ownerName='" + ownerName + '\'' +
                ", id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }
}
