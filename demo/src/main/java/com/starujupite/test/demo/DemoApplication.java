package com.starujupite.test.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		logger.info("Logging INFO with Logback");
		logger.info("Running on server port: 80");
		logger.error("Logging ERROR with Logback");
		SpringApplication.run(DemoApplication.class, args);
	}

}
