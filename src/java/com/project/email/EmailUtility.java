/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.email;


import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class EmailUtility {
  
  static void sendEmail(String host,String port,String senderEmail,String senderName,String password,String recipientEmail,String subject,String message) 
          throws UnsupportedEncodingException, MessagingException{
  
      //sets SMTP server properties
      
      Properties properties=new Properties();
      properties.put("mail.smtp.host",host);
      properties.put("mail.smtp.port", port);
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.starttls.enable","true");
    
      //create a new session with an authenticator
      
       Authenticator auth=new Authenticator() {
           @Override
           public PasswordAuthentication getPasswordAuthentication(){
           return new PasswordAuthentication(senderEmail,password);
           }
};
          Session session=Session.getInstance(properties, auth);
          
          //create a new e-mail message
          
          Message msg=new MimeMessage(session);
          msg.setFrom(new InternetAddress(senderEmail,senderName ));
          InternetAddress[] toAddress={new InternetAddress(recipientEmail)};
          msg.setRecipients(Message.RecipientType.TO, toAddress);
          msg.setSubject(subject);
          msg.setSentDate(new Date());
          msg.setText(message);
          
          
        System.out.println("hiiiii");
        
        //sends the e-mail
        Transport.send(msg);
         
  }
}