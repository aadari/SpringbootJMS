package com.demo.springboot.jms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.jms.pojos.Email;
import com.demo.springboot.jms.service.JMSService;

@RestController
public class EmailController
{
  @Autowired private JMSService jmsService;
  
  @RequestMapping(value = "/email", method = RequestMethod.POST, consumes="application/json")  
  public String sendEmail(@RequestBody Email email)
  {
	jmsService.send(email);
	return "Email sent";
	  
  }
}
