package config;

import objects.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration  // <- config class  ANNOTATION - marks the class
public class ProjectConfig {

    //put an instance in the spring context - bean

    @Bean //creates singleton
    //@Scope("prototype"); creates multiple instances
    public Cat cat(){ // creates an instance of cat
        Cat c = new Cat();
        c.name = "Tom";
        return c;
    }

}
