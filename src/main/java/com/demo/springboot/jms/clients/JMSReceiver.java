package com.demo.springboot.jms.clients;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.demo.springboot.jms.pojos.Email;

@Component
public class JMSReceiver
{
  @JmsListener(destination="mailbox")
  public void receiveMessage(Email email)
  {
	  System.out.println(email.getBody());
  }
}
