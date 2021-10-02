package com.codestudio.corp.testWebAtrio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.codestudio.corp")
@EntityScan("com.codestudio.corp.model")
/* JpaRepository Explicit definition when its package location
is different to base package */
@EnableJpaRepositories("com.codestudio.corp.repository")
public class App 
{	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
