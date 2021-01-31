


package com.example.demo.controller;


import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.emailer.IEmailerService;

@RestController
public class EmailServiceController
{
	//IEmailerSevice emailService = new DummyEmailSender();
	//Do not create any object with specific type ,let spring create it.
	//@Autowired  //at instance variable
	IEmailerService emailService;
	public IEmailerService getIEmailService()
	{
		return emailService;
	}
	/*@Autowired //at setter method 
	
		public void setEmailService(IEmailerSevice smtpEmailSender) {
		this.emailService = smtpEmailSender;
	}*/
	//Autowired using Constructot
	@Autowired
	public EmailServiceController(IEmailerService abc) {
		this.emailService =  abc;
	}
	// http://localhost:8080/sendemail
		@RequestMapping("/sendemail")
		public String email() throws MessagingException 
		{		
			emailService.sendEmail("stevejobs@apple.com","Launching of new Apple-Mobile Model", "Body of the email");
			return "Email Sent";
		}

}

