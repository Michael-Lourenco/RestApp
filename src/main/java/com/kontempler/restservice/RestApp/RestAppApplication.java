package com.kontempler.restservice.RestApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RestAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello mundo");
		SpringApplication.run(RestAppApplication.class, args);

	}

}
