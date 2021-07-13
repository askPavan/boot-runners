package com.boot.runners.appl;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// write logic to perform startup activities.
		//we get commandline arguments as ApplicationArguments class object
		//here we can extract optional arguments and non-optional arguments.
		System.out.println("application runners started.....");
	}
}
