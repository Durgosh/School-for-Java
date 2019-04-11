package main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

        }
    }
}
