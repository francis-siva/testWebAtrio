package com.codestudio.corp.testWebAtrio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.codestudio.corp.controller")
@EntityScan("com.codestudio.corp.model")
public class App 
{	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
