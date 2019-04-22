package com.durgosh.card.repository;

import com.durgosh.card.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class TransactionRepository {
    List<Transaction> transactions = new ArrayList<>();

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public Transaction getTransaction(String receiverId){
        Iterator iterator = this.transactions.iterator();

        Transaction transaction;

        do{
            if(!iterator.hasNext()){
                return null;
            }
            transaction = (Transaction) iterator.next();
        }while(!transaction.getReceiverId().equals(receiverId));

        return transaction;
    }

    @Override
    public String toString() {
        return "TransactionRepository{" +
                "transactions=" + transactions +
                '}';
    }
}
