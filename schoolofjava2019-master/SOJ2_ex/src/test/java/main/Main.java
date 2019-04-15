package main;

import beans.TransactionRepository;
import beans.TransactionService;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
          // TransactionRepository transactionRepository = context.getBean(TransactionRepository.class); // by type


           //by name
           TransactionRepository transactionRepository =
                   context.getBean("transactionRepository", TransactionRepository.class);
           TransactionRepository transactionRepository2 =
                   context.getBean("transactionRepository", TransactionRepository.class);
           transactionRepository2.setNume("Singleton");

           System.out.println(transactionRepository);
           System.out.println(transactionRepository2);


           //prototype
           TransactionRepository transactionRepositoryPrototype =
                   context.getBean("transactionRepository2", TransactionRepository.class);
           TransactionRepository transactionRepositoryPrototype2 =
                   context.getBean("transactionRepository2", TransactionRepository.class);
           transactionRepositoryPrototype2.setNume("Prototype"); // SE MODIFIFCA DOAR INSTANTA DORITA

           System.out.println(transactionRepositoryPrototype);
           System.out.println(transactionRepositoryPrototype2);

           //ex transaction service
//           TransactionService transactionService = context.getBean(TransactionService.class);
//           transactionService.setTransactionRepository(transactionRepository());
//           System.out.println(transactionService);

       }
    }
}
