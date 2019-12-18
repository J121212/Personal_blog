package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.demo.dao")
@SpringBootApplication
public class J12BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(J12BlogApplication.class, args);
	}

}
