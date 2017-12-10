package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;


@EnableAdminServer
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootAdmin {
	public static void main(String[] args)throws Exception {
		SpringApplication.run(SpringBootAdmin.class, args);
	}

}
