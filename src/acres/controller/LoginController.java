package acres.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import acres.dao.UserRepository;
import acres.dto.UserInfo;
import acres.exception.UsernameNotFoundException;
import acres.service.UserAuthenticationService;
import acres.service.UserRetrievalService;

@Controller
@SessionAttributes("currentUser")
public class LoginController {
	
	@Autowired UserAuthenticationService userAuth;
	
	@Autowired UserRetrievalService uRetrieve;
	
	@PostMapping("authenticate.test")
	public ModelAndView confirmUser(HttpServletRequest request, @ModelAttribute UserInfo currentUser) throws UsernameNotFoundException {
		ModelAndView mv = new ModelAndView();
		int confirmStatus = 1;
		
		if(userAuth.authenticateUser(currentUser)) {
			mv.setViewName("login");
			mv.addObject("userError", "<p style='color: red'>The username does not exist.</p><br/>" + 
									"<form action='register.test' method='get'><input type='submit' value='Click here to register for an account'></form>");
			throw new UsernameNotFoundException();
		}
		
		if(confirmStatus == 1) {
			UserInfo dbUser = uRetrieve.retrieveUser(currentUser);
			String dbPass = dbUser.getPassword1();
			String inputPass = currentUser.getPassword1();
			if(!dbPass.equals(inputPass)) {
				mv.setViewName("login");
				mv.addObject("passError", "<p style='color: red'>The password is incorrect</p>");
			}
			else {
				mv.setViewName("loginComplete");
				mv.addObject("currentUser", currentUser);
			}
		}
		return mv;
	}
	
	@GetMapping("login.test")
	public ModelAndView getLoginPage() {
		return new ModelAndView("login");
	}
}
