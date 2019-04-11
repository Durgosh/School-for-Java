package main;

import beans.TransactionRepository;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ProjectConfig.class)){
            //TransactionRepository transactionRepository = context.getBean((TransactionRepository.class));

            //System.out.println(transactionRepository);

            TransactionRepository transactionRepository = context.getBean("transactionRepository2", TransactionRepository.class);
            TransactionRepository transactionRepository2 = context.getBean("transactionRepository2", TransactionRepository.class);

            transactionRepository2.setName(("x"));

            System.out.println(transactionRepository);
            System.out.println(transactionRepository2);
        }

    }
}
