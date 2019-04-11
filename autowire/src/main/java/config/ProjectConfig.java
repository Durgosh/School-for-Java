package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import repository.TransactionRepository;

@Configuration
@ComponentScan (basePackages = {"repository", "service"})

public class ProjectConfig {
    @Bean(name = "transactionRepository")
    public TransactionRepository transactionRepository(){
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setName("Transaction 1");
        return new TransactionRepository();
    }
}
