package com.demo.springboot.jms.service;

import com.demo.springboot.jms.pojos.Email;

public interface JMSService
{
  public void send(Email email);

}
