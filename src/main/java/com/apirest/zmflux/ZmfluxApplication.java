package com.apirest.zmflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZmfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZmfluxApplication.class, args);
		System.out.print("Ola, mundo com webflux!");
	}

}
