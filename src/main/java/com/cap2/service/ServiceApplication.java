package com.cap2.service;

import javax.enterprise.context.ApplicationScoped;

import com.cap2.service.qualifiers.ServiceApplicationQualifier;

@ApplicationScoped
@ServiceApplicationQualifier
public class ServiceApplication implements IServiceScoped {
	
	private double myRamdom;
	
	public ServiceApplication () {
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
