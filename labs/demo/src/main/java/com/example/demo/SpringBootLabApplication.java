package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootLabApplication implements CommandLineRunner {

	private final MainService mainService;

	@Autowired
	public SpringBootLabApplication(MainService mainService) {
		this.mainService = mainService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mainService.performAction();
	}
}