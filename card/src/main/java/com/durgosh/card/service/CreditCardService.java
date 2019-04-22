package com.durgosh.card.service;

import com.durgosh.card.model.CreditCard;
import com.durgosh.card.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {
    @Autowired
    CreditCardRepository creditCardRepository;

    @Autowired
    TransactionService transactionService;

    public void addCreditCard(CreditCard creditCard){
        creditCardRepository.addCreditCard(creditCard);
    }

    public void newTransaction(String cardId, String receiverId, double amount){
        CreditCard creditCard =this.creditCardRepository.getCreditCard(cardId);
        if(creditCard!=null){
            creditCard.setBalance(creditCard.getBalance()-amount);
        }

        transactionService.addTransaction(receiverId,amount);
    }

}
