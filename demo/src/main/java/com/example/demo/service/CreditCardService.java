package com.example.demo.service;

import com.example.demo.model.CreditCard;
import com.example.demo.repository.CreditCardRepository;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {
    private CreditCardRepository creditCardRepository = new CreditCardRepository();

    public CreditCardService( CreditCardRepository creditCardRepository){
        this.creditCardRepository = creditCardRepository;
    }

    public void addCreditCard(CreditCard creditCard){
        if(creditCard.getCardNumber().length() == 16){
            creditCardRepository.addCreditCard(creditCard);
        }
    }
}
