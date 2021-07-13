package com.boot.runners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootRunnersApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRunnersApplication.class, args);
		System.out.println("SpringApplication Started.....");
	}

}
