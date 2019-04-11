package main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;
import config.ProjectConfig;
import model.BankAccount;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.BankAccountService;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            BankAccount bankAccount1 = new BankAccount();
            bankAccount1.setiBan("1");
            bankAccount1.setOwnerName("Bob");
            bankAccount1.setBalance(500.00);

            BankAccount bankAccount2 = new BankAccount();
            bankAccount2.setiBan("2");
            bankAccount2.setOwnerName("Bobby");
            bankAccount2.setBalance(300.00);

            //Service -> repository
            //main -> service

            BankAccountService bankAccountService = context.getBean(BankAccountService.class);
            bankAccountService.addBankAccount(bankAccount1);
            bankAccountService.addBankAccount(bankAccount2);

            System.out.println(bankAccount1);
            System.out.println(bankAccount2);

            bankAccountService.transferMoney("1","2",200);

            System.out.println(bankAccount1);
            System.out.println(bankAccount2);


        }
    }
}
