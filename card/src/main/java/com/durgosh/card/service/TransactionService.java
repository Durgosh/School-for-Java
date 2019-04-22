package com.durgosh.card.service;

import com.durgosh.card.model.Transaction;
import com.durgosh.card.repository.CreditCardRepository;
import com.durgosh.card.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public void addTransaction(String receiverId, double amount){
        Transaction transaction = new Transaction(receiverId, amount);
        transactionRepository.addTransaction(transaction);
    }


}
