package com.yegecali.examplerediscache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ExamplerediscacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamplerediscacheApplication.class, args);
	}

}
