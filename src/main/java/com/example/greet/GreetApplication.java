package com.example.greet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class GreetApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetApplication.class, args);
	}

	@GetMapping("/greet")
	public String greet()
	{
		String message="hello";
		return message;
	}
	
	@GetMapping("/cal/{operation}/{a}/{b}")
	public String calculator(@PathVariable String operation,@PathVariable int a,@PathVariable int b) 
	{
	 
	if(operation.equalsIgnoreCase("add"))
	  {return String.valueOf(a+b);}
	else if(operation.equalsIgnoreCase("sub")) {return String.valueOf(a-b);}
	else if(operation.equalsIgnoreCase("mul")) {return String.valueOf(a*b);}
	else if(operation.equalsIgnoreCase("divide")) {return String.valueOf(a/b);}
	else {
		return "invalid option ,try again";
		}
}
}
