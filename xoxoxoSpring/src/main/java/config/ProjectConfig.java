package config;

import beans.TransactionRepository;
import beans.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean(name = "transactionRepository")
    public TransactionRepository transactionRepository(){
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setName("Transaction 1");
        return new TransactionRepository();
    }

    @Bean(name = "transactionRepository2")
    //@Primary
    @Scope (scopeName = "prototype")
    public TransactionRepository transactionRepository2(){
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setName("Transaction 2");
        return new TransactionRepository();
    }

    @Bean
    public TransactionService transactionService(){
        TransactionService transactionService = new TransactionService();

        return new TransactionService();
    }
}


