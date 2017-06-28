package controller;

import java.util.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

	@RequestMapping("/")
	String hello() {
		return "<H>Hello World!</H>123";
	}

	@RequestMapping("/hello2")
	String hello2() {
		return "Hello World! " + new Date();
	}
	
	@RequestMapping("/users/{username}")
	public String userProfile(@PathVariable("username") String username) {
	    return String.format("user %s", username);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet() {
	    return "Login Page";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost() {
	    return "Login Post Request";
	}

}
