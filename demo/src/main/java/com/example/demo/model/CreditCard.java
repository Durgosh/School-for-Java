package com.example.demo.model;

public class CreditCard {
    String ownerName;
    String cardNumber;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "ownerName='" + ownerName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
