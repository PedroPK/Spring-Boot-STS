package com.example.algaworks;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}
	
	//@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext pAppContext) {
		return args -> {
			System.out.println("Inspecting Beans provided by Spring Boot:");
			
			String[] beanNamesArray = pAppContext.getBeanDefinitionNames();
			Arrays.sort(beanNamesArray);
			
			for ( String beanName: beanNamesArray ) {
				System.out.println(" - Bean Name: " + beanName);
			}
		};
	}
	
}
