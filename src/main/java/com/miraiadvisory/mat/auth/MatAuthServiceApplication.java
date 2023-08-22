package com.miraiadvisory.mat.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.miraiadvisory.mat")
//@EnableFeignClients(basePackages = "com.miraiadvisory.mat")
//@EnableScheduling
public class MatAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatAuthServiceApplication.class, args);
	}

}
