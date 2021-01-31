package com.example.demo.emailer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.context.annotation.Profile;


	
	@Configuration
	public class MailConfig {
		//IEmailerService emailService = new DummyEmailSender();
		@Bean
		@Profile("dev")
		public IEmailerService dummyEmailSender() {
			return new DummyEmailSender();
		}
		@Bean
		//@Primary
		@Profile("prod")
		public IEmailerService smtpEmailSender(JavaMailSender javaMailSender) {
			return new SmtpEmailSender(javaMailSender);
		}
	}
	


