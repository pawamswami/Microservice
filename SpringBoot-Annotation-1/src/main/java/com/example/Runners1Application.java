package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationContextEvent;

import com.boot.ConfigurationClass;

@SpringBootApplication
public class Runners1Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
   ApplicationContext context = SpringApplication.run(Runners1Application.class, args);

   AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Student student = (Student) context2.getBean("student");
		student.setStudentId(101);
		student.setStudentName("Pawan");
		System.out.println(student);
	}

}
