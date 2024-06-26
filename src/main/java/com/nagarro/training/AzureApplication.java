package com.nagarro.training;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureApplication {

	@GetMapping("/home")
	public String Home() {
		return "Hi!" + "Spring boot Application successfully deployed on azure cloud";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}
