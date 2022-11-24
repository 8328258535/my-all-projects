package com.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDeployApplication {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello my name is tajdar ahamed and this app is running on aws";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsDeployApplication.class, args);
	}

}
