package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WorkshopDipApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WorkshopDipApplication.class, args);
		System.out.println("Bean count= " + context.getBeanDefinitionCount());

		GeneratedIdService service = context.getBean(GeneratedIdService.class);
		String id = service.get();
		System.out.println("ID=" + id);
	}

}
