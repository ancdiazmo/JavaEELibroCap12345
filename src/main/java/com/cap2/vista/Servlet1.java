package com.cap2.vista;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cap2.service.IService;
import com.cap2.service.IServiceScoped;
import com.cap2.service.qualifiers.HoyQualifier;
import com.cap2.service.qualifiers.RamdomQualifier;
import com.cap2.service.qualifiers.Service1Qualifier;
import com.cap2.service.qualifiers.Service2Qualifier;
import com.cap2.service.qualifiers.ServiceApplicationQualifier;
import com.cap2.service.qualifiers.ServiceConversationQualifier;
import com.cap2.service.qualifiers.ServiceRequestQualifier;
import com.cap2.service.qualifiers.ServiceSessionQualifier;
import com.cap3.validation.ValidacionDeBeans;

public class Servlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/*Qualifiers*/
	@Inject @Service1Qualifier
	private IService service1;
	@Inject @Service2Qualifier
	private IService service2;
	
	/*Producers*/
	@Inject @RamdomQualifier
	private double myRamdom;
	@Inject @HoyQualifier
	private Date hoy;
	
	/*Scopes*/
	@Inject @ServiceApplicationQualifier
	private IServiceScoped serviceApplication;
	@Inject @ServiceConversationQualifier
	private IServiceScoped serviceConversation;
	@Inject @ServiceRequestQualifier
	private IServiceScoped serviceRequest;
	@Inject @ServiceSessionQualifier
	private IServiceScoped serviceSession;
	
	@Inject
	private Logger logger;
       
    public Servlet1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		logger.info(service1.getSaludo());
		logger.info(service2.getSaludo());
		logger.info("Un ramdom es: " + myRamdom);
		logger.info("La fecha de hoy es: " + hoy);
		logger.info("Soy Application y mi ramdom es: " + serviceApplication.getMyRamdom());
		logger.info("Soy Conversation y mi ramdom es: " + serviceConversation.getMyRamdom());
		logger.info("Soy Request y mi ramdom es: " + serviceRequest.getMyRamdom());
		
		logger.info("Soy Session y mi ramdom es: " + serviceSession.getMyRamdom());
		
		ValidacionDeBeans validacion = new ValidacionDeBeans (null,null,null,null,null);
		
		logger.info(validacion.getAtributo1().toLowerCase());

		request.getRequestDispatcher("/WEB-INF/cap2/vista/Servlet1.jsp").forward(request, response);
	}

}













