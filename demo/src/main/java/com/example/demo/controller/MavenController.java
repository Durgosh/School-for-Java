package com.example.demo.controller;

import com.example.demo.model.BankAccount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MavenController {

    //@RequestMapping(path = "/myresource/{variablePath}",method = RequestMethod.GET) // ~~ get the path, what's after "/" ~~ variablePath can vary
    @GetMapping(path = "/myresource/{variablePath}") // same as above but only with get
    public ResponseEntity<String> firstGet(@PathVariable String variablePath){ // name variable can vary in the path after second "/"
        String value = "Welcome " + variablePath+ "! This is my first web service";

        ResponseEntity<String> responseEntity = new ResponseEntity<>(value, HttpStatus.OK);

        return responseEntity;
    }

    @PostMapping(path = "/mypost")
    public ResponseEntity<BankAccount> myPost(@RequestBody BankAccount bankAccount){ // json -> java
        bankAccount.setBalance(bankAccount.getBalance()+50);
        ResponseEntity<BankAccount> responseEntity = new ResponseEntity<>(bankAccount, HttpStatus.OK);
        return responseEntity;  // java object -> json

    }
}
