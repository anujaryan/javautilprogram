package com.mail.api;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.codec.binary.Base64;



public class SendMail {

	
	
	//create message content here
	public static MimeMessage createEmail(String to,String from,String subject,String bodytext) throws AddressException, MessagingException
	{
		
		Properties props=new Properties();
		
		
		Session session =Session.getDefaultInstance(props,null);
		
		
		
		MimeMessage email=new MimeMessage(session);
		
		
		email.setFrom(new InternetAddress(from));
		
		email.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));
		
		
		email.setSubject(subject);
		email.setText(bodytext);
		
	
		return email;
		
	}
	
	
	//next step to encode the MimeMessage by base64Encode...
	
	public static Message createMessageWithEmail(MimeMessage emailContent) throws IOException, MessagingException {
		
		
		ByteArrayOutputStream buffer =new ByteArrayOutputStream();
		
		
		
		emailContent.writeTo(buffer);
		
		System.out.println(buffer);
		byte[] bytes=buffer.toByteArray();
		
		String encodeString=Base64.encodeBase64URLSafeString(bytes);
		
		//Message message=new Message();
		
		
		
		
		
		
		
		
		
		return emailContent;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	
}



