package com.example.demo.emailer;

import javax.mail.MessagingException;

public interface IEmailerService
{
	public void sendEmail(String emailID, String subject, String mailContent) throws MessagingException;
	
}

