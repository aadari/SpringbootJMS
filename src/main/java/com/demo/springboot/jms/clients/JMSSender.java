package com.demo.springboot.jms.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.demo.springboot.jms.pojos.Email;

@Component
public class JMSSender
{
   @Autowired private JmsTemplate jmsTemplate;
   
   public void send(Email email)
   {
	   jmsTemplate.convertAndSend("mailbox",email);
   }
}
