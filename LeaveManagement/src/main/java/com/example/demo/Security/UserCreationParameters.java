package com.example.demo.Security;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class UserCreationParameters {

	public String IdGenerator() {
		String unique_id= UUID.randomUUID().toString();
		return unique_id;
	}
}
