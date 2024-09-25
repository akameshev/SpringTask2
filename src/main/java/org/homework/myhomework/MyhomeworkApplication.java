package org.homework.myhomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class MyhomeworkApplication {

	@RequestMapping("/")
	String startPage(){
		return "Hi! Welcome to my StartPage";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyhomeworkApplication.class, args);
	}

}
