package com.codecat.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(LearningApplication.class, args);
		Pizza pizza = applicationContext.getBean(Pizza.class);
		pizza.eat();
	}
}