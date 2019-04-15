package com.example.demo.repository;

import com.example.demo.model.CreditCard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CreditCardRepository {
    List<CreditCard> creditCards = new ArrayList<>();

    public void addCreditCard(CreditCard creditCard){
        creditCards.add(creditCard);
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }
}
