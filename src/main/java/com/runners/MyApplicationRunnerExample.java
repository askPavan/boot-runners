package com.runners;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Pavan Kumar
 *
 */

@Component
public class MyApplicationRunnerExample implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationRunner Arguments....");
		for (String arg : args.getSourceArgs()) {
			System.out.println(arg);
		}

		System.out.println("Non-option arguments:");
		List<String> nonOptionalList = args.getNonOptionArgs();
		for (String nonOptArgs : nonOptionalList) {
			System.out.println(nonOptArgs);
		}

		System.out.println("Option arguments:");
		for (String optArgName : args.getOptionNames()) {
			System.out.println(optArgName + " : " + args.getOptionValues(optArgName));
		}

	}

}
