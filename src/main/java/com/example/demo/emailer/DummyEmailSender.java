package com.example.demo.emailer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/*import org.springframework.stereotype.Component;
@Component("DummyBean")*/
public class DummyEmailSender implements IEmailerService
{
	private static Log Log=LogFactory.getLog(DummyEmailSender.class);
	
	//@Override
	public void sendEmail(String emailID, String subject, String mailContent)
	{
		//To-Do auto generated method sub
		Log.info("Dummy Mail Receiver ID : "+emailID);
		Log.info("Dummy Mail Subject : "+subject);
		Log.info("Dummy Mail Body : "+mailContent);
		Log.warn("THIS IS JUST DUMMY EMAIL SENDER");
		
	}

}
