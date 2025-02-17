package com.company.course;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApp {
	
	public static void main(String[] args) {
		
		SpringApplication.run(CourseApp.class, args);
		
		System.out.println(Integer.parseUnsignedInt("4294967295"));
		
		LocalDate output=LocalDate.ofYearDay(2020, 255);
		System.out.println(output);
	}

}
