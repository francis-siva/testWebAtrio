package com.codestudio.corp.testWebAtrio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "com.baeldung.boot.jsp")
@EntityScan("com.codestudio.corp.model")
public class App 
{
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
