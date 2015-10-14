package practice.premjit.spring.web.controller;

import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		String message = "HELLO SPRING MVC "+(ts == null ? " " : ts.toLocaleString());
		return new ModelAndView("hellopage", "message", message);
	}

}
