package com.example.demo.emailer;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//@Component("smtpBean")
//@Qualifier("smtp")

public class SmtpEmailSender implements IEmailerService
{
	private static Log Log=LogFactory.getLog(SmtpEmailSender.class);
	private JavaMailSender javaMailSender;
	
	public SmtpEmailSender(JavaMailSender javaMailSender)
	{
		// TODO Auto-generated constructor stub
		this.javaMailSender = javaMailSender;
	}

	//@Override
	public void sendEmail(String emailID, String subject, String mailContent) throws MessagingException
	{
		//To-Do auto generated method sub
		Log.info("SMTP Mail Receiver ID : "+emailID);
		Log.info("SMTP Mail Subject : "+subject);
		Log.info("SMTP Mail Body : "+mailContent);
		Log.warn("THIS IS JUST SMTP EMAIL SENDER");
		
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;

		helper = new MimeMessageHelper(message, true); // true indicates
 					  				                   // multipart message
		helper.setSubject("This is the trail test message");
		helper.setTo("namrata3005fadatare@gmail.com");
		helper.setText("<h1>NAMRATA FADATARE. </h1>", true); // true indicates html

		// continue using helper for more functionalities
        // like adding attachments, etc.  
		
		javaMailSender.send(message);
		
		
	}

}

