package com.demo.springboot.jms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.jms.clients.JMSSender;
import com.demo.springboot.jms.pojos.Email;
import com.demo.springboot.jms.service.JMSService;

@Service
public class JMSServiceImpl implements JMSService
{
   @Autowired private JMSSender jmsSender;
   
	@Override
	public void send(Email email)
	{
		jmsSender.send(email);
		
	}

}
