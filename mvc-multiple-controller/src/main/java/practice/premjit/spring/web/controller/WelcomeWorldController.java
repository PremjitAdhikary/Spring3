package practice.premjit.spring.web.controller;

import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeWorldController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		String message = "WELCOME SPRING MVC "+(ts == null ? " " : ts.toLocaleString());
		return new ModelAndView("welcomepage", "message", message);
	}

}
