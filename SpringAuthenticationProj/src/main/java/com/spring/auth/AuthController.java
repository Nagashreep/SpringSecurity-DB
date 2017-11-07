package com.spring.auth;

import java.lang.ProcessBuilder.Redirect;
import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AuthController {
	
//	private static final Logger log = LoggerFactory.getLogger(AuthController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		log.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	/*@RequestMapping(value="/j_spring_security_check")
	public String authenticateUser(Principal user){
		
//		log.debug("inside login authentication");
		
		return "/loginSuccess";
		
	}*/
	
	
	@RequestMapping(value="/loginSuccess")
	public String loginSuccess(Model model,Principal user){
		
//		log.debug("inside login success");
		
		model.addAttribute("user", user);
		
		return "login/welcomePage";
	}
	
	@RequestMapping(value="/loginError")
	public String loginFailure (){
		
//		log.debug("inside login error");
		
		return"login/loginErrorPage";
	}
	
	@RequestMapping(value="/login")
	public String loginPage(){
		
//		log.debug("inside login");
		
		return "login/loginPage";
	}
	
	
	
}
