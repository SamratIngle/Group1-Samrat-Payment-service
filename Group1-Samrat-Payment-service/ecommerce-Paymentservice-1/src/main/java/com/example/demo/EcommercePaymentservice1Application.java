package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommercePaymentservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(EcommercePaymentservice1Application.class, args);
	}
	@Bean
	public ModelMapper createModelMapper() {
		return new ModelMapper();
	}
}
