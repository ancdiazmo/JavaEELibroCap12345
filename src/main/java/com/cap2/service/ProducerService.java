package com.cap2.service;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import com.cap2.service.qualifiers.HoyQualifier;
import com.cap2.service.qualifiers.RamdomQualifier;

public class ProducerService {
	
	@Produces @RamdomQualifier
	public double ramdom () {
		return Math.random() * 10;
	}
	
	public void ramdomDisposer (@Disposes @RamdomQualifier double ramdom) {
		ramdom = 0;
	}
	
	@Produces @HoyQualifier
	public Date hoy () {
		return Calendar.getInstance().getTime();
	}
	
	public void hoyDisposer (@Disposes @HoyQualifier Date hoy) {
		hoy = null;
	}
	
	@Produces
	public Logger logger (InjectionPoint injectionPoint) {
		return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}
	
	public void logggerDisposer (@Disposes Logger logger) {
		logger = null;
	}
}
