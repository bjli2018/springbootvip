package com.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.enjoy.dao.mapper")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
