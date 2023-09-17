package com.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Pavan Kumar
 *
 */

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command-line arguments for CommandLineRunner:");
		for (String arg : args) {
			System.out.println(arg);
		}
	}

}
