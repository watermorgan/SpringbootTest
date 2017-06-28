package com.yingcankeji.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import controller.HelloWorldController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}

}
