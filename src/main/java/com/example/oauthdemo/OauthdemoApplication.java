package com.example.oauthdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OauthdemoApplication {

    public static void main(String[] args) {
		SpringApplication.run(OauthdemoApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
    public String example() {
        return "Say something nice to user";
	}
}
