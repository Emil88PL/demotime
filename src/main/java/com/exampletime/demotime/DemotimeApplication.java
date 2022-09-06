package com.exampletime.demotime;

import java.time.LocalTime;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemotimeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemotimeApplication.class, args);
		
		Object byName = context.getBean("timenow");
		Object greeting = context.getBean("greeting");
		Object farewell = context.getBean("farewell");


		System.out.println("Greeting" + " " + greeting);
		System.out.println("Greeting" + " " + greeting.hashCode());

		System.out.println("Farweell" + " " + farewell.hashCode());
		System.out.println("Farweell" + " " + farewell.hashCode());

		
		// String byType = context.getBean(String.class);
		// String byBoth = context.getBean("timenow", String.class);
	
		 System.out.println("By Name " + byName);
		// System.out.println("By Type " + byType);
		// System.out.println("By Both " + byBoth);

	}
}




// <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation -->
// <dependency>
//     <groupId>org.springframework.boot</groupId>
//     <artifactId>spring-boot-starter-validation</artifactId>
//     <version>2.7.3</version>
// </dependency>

// from QA Trainer to everyone in this session:    11:39 AM
// @Pattern( regexp = "       "
