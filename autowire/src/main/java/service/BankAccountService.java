package service;

import model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BankAccountRepository;

@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;   //should be BankAccountRepository      <--------

    public void addBankAccount(BankAccount bankAccount){
        bankAccountRepository.insertBankAccount(bankAccount);

    }

    public void transferMoney(String fromIban, String toIban, double amount){
        BankAccount fromBankAccount = bankAccountRepository.getBankAccount(fromIban);
        BankAccount toBankAccount = bankAccountRepository.getBankAccount(toIban);

        if (fromBankAccount != null && toBankAccount != null){
            fromBankAccount.setBalance((fromBankAccount.getBalance() - amount));
            toBankAccount.setBalance(toBankAccount.getBalance() + amount);
        }
    }
}
