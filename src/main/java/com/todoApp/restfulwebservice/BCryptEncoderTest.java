package com.todoApp.restfulwebservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoderTest {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		for(int i = 0 ; i <=10; i++) {
			String encodeString = encoder.encode("123");
			System.out.println(encodeString);
		}
		
	}

}
