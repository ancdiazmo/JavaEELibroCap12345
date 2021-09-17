package com.cap2.interceptors;

import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Loggable
@Priority(1)
public class LoggerInterceptor {
	
	@Inject
	private Logger logger;
	
	@AroundInvoke
	public Object antesDeLaEjecucion (InvocationContext context) throws Exception {
		logger.info("Estoy en el interceptor logger");
		return context.proceed();
	}
}
