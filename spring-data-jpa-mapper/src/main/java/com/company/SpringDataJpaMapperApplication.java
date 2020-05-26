package com.company;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMapperApplication.class, args);
		System.out.println("holaaaa");
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

}
