package practice.premjit.spring.web.controller;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import practice.premjit.spring.model.User;
import practice.premjit.spring.model.Users;

@Controller
@RequestMapping("/users")
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}", headers="Accept=*/*")
	public @ResponseBody User getUserById(@PathVariable String id){
		User user = new User();
		user.setFirstName("premjit");
		user.setLastName("adhikary");
		return user;
	}
	
	@RequestMapping(method = RequestMethod.GET,  headers="Accept=*/*")
	public @ResponseBody Users getAllUsers(){
		User user1 = new User();
		user1.setFirstName("premjit");
		user1.setLastName("adhikary");

		User user2 = new User();
		user2.setFirstName("alo");
		user2.setLastName("adhikary");
 
        Users users = new Users();
        users.setUsers(new ArrayList<User>());
        users.getUsers().add(user1);
        users.getUsers().add(user2);
        
		return users;
	}

}
