package com.example.oauthdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OauthdemoApplication {

	private ClientRegistrationRepository repository;

    @Autowired
    public OauthdemoApplication(ClientRegistrationRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
		SpringApplication.run(OauthdemoApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public ClientRegistration example(){
		return repository.findByRegistrationId("google");
	}
}
