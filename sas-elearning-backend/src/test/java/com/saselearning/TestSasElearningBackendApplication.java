package com.saselearning;

import org.springframework.boot.SpringApplication;

public class TestSasElearningBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(SasElearningBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
