package com.cap2.service;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import com.cap2.interceptors.Loggable;
import com.cap2.interceptors.Serviceable;
import com.cap2.service.qualifiers.Service2Qualifier;

@Service2Qualifier
public class Service2 implements IService {
	
	@Inject
	private Logger logger;

	@Override
	@Loggable
	@Serviceable
	public String getSaludo() {
		return "Hola soy service2";
	}
	
	@PostConstruct
	public void init () {
		logger.info("Se crea un service2");
	}

}
