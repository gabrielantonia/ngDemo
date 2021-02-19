package com.accenture.ngDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.Stream;
//@EnableJpaRepositories(basePackages = "com.accenture")
//@ComponentScan("com.accenture")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserService userService){
		return args -> {
			Stream.of("John", "Julie", "Jeniffer", "Rachael").forEach(name -> {
				User user = new User(name, name.toLowerCase() + "@domain.com");
				userService.save(user);
			});
			userService.findAll().forEach(System.out::println);
		};
	}

}
