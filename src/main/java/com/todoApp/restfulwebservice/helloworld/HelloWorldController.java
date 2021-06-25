package com.todoApp.restfulwebservice.helloworld;

import javax.management.RuntimeErrorException;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class HelloWorldController {
	
	//GET 
	//URI - /hello-world
	//method - "HelloWorld"
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	//hello-world-bean	
		//auto convert to json file
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	//URI - /hello-world/path-variable/gracelyun
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		//throw new RuntimeException("Something went wrong");
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	


}
