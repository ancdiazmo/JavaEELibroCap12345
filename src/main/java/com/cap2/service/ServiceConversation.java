package com.cap2.service;

import java.io.Serializable;
import javax.enterprise.context.ConversationScoped;

import com.cap2.service.qualifiers.ServiceConversationQualifier;

@ConversationScoped
@ServiceConversationQualifier
public class ServiceConversation implements IServiceScoped, Serializable {
	
	private static final long serialVersionUID = 1L;
	private double myRamdom;
	
	public ServiceConversation () {
		myRamdom = Math.random() * 10;
	}

	@Override
	public String getSaludo() {
		return null;
	}
	
	@Override
	public double getMyRamdom() {
		return this.myRamdom;
	}
}
