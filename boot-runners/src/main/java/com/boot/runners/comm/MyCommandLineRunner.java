package com.boot.runners.comm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// write here startup activities.
		// his method will be called after the IOC container has been created
		// and after bean definitions has been instantiated and before starting the requests.
		
		System.out.println("commandline runners started.....");
	}

}
