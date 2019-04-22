package com.durgosh.card.controller;

import com.durgosh.card.model.CreditCard;
import com.durgosh.card.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CreditCardController {

    //@Autowired
    //private CreditCardService creditCardService;

    private CreditCardService creditCardService;

    @Autowired
    public CreditCardController(CreditCardService creditCardService){
        this.creditCardService = creditCardService;
    }

    @PostMapping(path = "/add/card")
    public void addCreditCard(@RequestBody CreditCard creditCard){
        creditCardService.addCreditCard(creditCard);
        //creditCardService.newTransaction("1234","1111",50);
    }
}
