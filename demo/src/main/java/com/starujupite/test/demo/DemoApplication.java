package com.starujupite.test.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {
	public static void main(String[] args) {
		log.info("Logging INFO with Logback");
		log.info("Running on server port: 80");
		log.error("Logging ERROR with Logback");
		SpringApplication.run(DemoApplication.class, args);
	}

}
