package com.mobileprogramming.SpringDataJDBCOracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mobile.controller","com.mobile.dao","com.mobile.model"})
public class SpringDataJdbcOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcOracleApplication.class, args);
	}

}
