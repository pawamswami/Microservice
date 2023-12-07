package com.boot;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.example.Student;

@Configuration
public class ConfigurationClass {
	
	@Bean("student")
	public Student getStudent()
	{
		return new Student();
	}

}
