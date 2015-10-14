package practice.premjit.spring.web.controller;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse res){
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		
		if(pass.equals("admin")){
			String message = "Hello "+name + " " +(ts == null ? " " : ts.toLocaleString());
			return new ModelAndView("hellopage", "message", message);
		} else {
			return new ModelAndView("errorpage", "message","Sorry, username or password error");
		}
	}

}
