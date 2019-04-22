package com.durgosh.card.repository;

import com.durgosh.card.model.CreditCard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class CreditCardRepository {
    List<CreditCard> creditCards = new ArrayList<>();

    public void addCreditCard(CreditCard creditCard){
        creditCards.add(creditCard);
    }


    public CreditCard getCreditCard(String id){
        Iterator iterator = this.creditCards.iterator();

        CreditCard creditCard;

        do{
            if(!iterator.hasNext()){
                return null;
            }
            creditCard = (CreditCard) iterator.next();
        }while(!creditCard.getId().equals(id));

        return creditCard;
    }
}
