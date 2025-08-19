package com.example.testrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestrunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestrunnerApplication.class, args);
	}

	@GetMapping("/testRunner")
    public String hello(@RequestParam(value = "name", defaultValue = "Test Prajoth AN - Demo Production") String name) {
      return String.format("Hello %s!", name);
    }
}
