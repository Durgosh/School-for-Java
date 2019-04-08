package main;

import config.ProjectConfig;
import objects.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main { //we have to tell spring about that what we use exists and get it to use them

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Cat c = context.getBean(Cat.class); // take from context to use
            System.out.println(c.name);
        }
    }
}
