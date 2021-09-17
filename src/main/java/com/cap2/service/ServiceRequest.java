package com.cap2.service;

import javax.enterprise.context.RequestScoped;

import com.cap2.service.qualifiers.ServiceRequestQualifier;

@RequestScoped
@ServiceRequestQualifier
public class ServiceRequest implements IServiceScoped {
	
	private double myRamdom;
	
	public ServiceRequest () {
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
