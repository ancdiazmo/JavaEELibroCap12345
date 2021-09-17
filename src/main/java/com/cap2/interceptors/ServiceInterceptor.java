package com.cap2.interceptors;

import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Serviceable
@Interceptor
@Priority(2)
public class ServiceInterceptor {
	
	@Inject
	private Logger logger;
	
	@AroundInvoke
	public Object interceptarServiceLayer (InvocationContext context) throws Exception {
		logger.info("Estoy en el interceptor de servicios");
		return context.proceed();
	}
}
