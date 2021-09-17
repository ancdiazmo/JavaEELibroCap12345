package com.cap2.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

import com.cap2.service.qualifiers.ServiceSessionQualifier;

@SessionScoped
@ServiceSessionQualifier
public class ServiceSession implements IServiceScoped, Serializable {
	
	private static final long serialVersionUID = 1L;
	private double myRamdom;
	
	public ServiceSession () {
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
