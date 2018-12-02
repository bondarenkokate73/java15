package com.mycompany.resume;
import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaApplication1 {
    public static void main(String[] args) throws IOException, InterruptedException 
    {
//       Func f = new Func();
//       f.func();
        
        ApplicationContext context = new AnnotationConfigApplicationContext("com.mycompany.resume");
        HtmlGenerator html = context.getBean(HtmlGenerator.class);
        html.HtmlGenerator("personfinal.properties", context);
        html.generate();
    }
    }