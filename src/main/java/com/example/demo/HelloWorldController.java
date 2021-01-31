package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@Value("${app.smtp.name}")
	private String smtpName;
	@RequestMapping("/hello1")
	public String hello1() 
	{
		return "HELLO MODERN STUDENTS";
	}

}
