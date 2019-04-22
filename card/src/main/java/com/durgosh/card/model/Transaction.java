package com.durgosh.card.model;

public class Transaction {
    String receiverId;
    double amount;

    public Transaction(String receiverId, double amount){
        this.receiverId = receiverId;
        this.amount = amount;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "receiverId='" + receiverId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
