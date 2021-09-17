package com.cap2.service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.cap2.interceptors.Loggable;
import com.cap2.interceptors.Serviceable;
import com.cap2.service.qualifiers.Service1Qualifier;

@Service1Qualifier
public class Service1 implements IService {
	
	@Inject
	private Logger logger;

	@Override
	@Loggable
	@Serviceable
	public String getSaludo() {
		return "Hola soy service1";
	}
	
	@PostConstruct
	public void init () {
		logger.info("Se crea un service1");
	}

}
