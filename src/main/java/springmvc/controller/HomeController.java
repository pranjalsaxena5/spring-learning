package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = { "/home", "/" })
	public String home() {
		System.out.println("This is home URL!");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about Controller!");
		return "about";
	}

	@RequestMapping("/services")
	public String services() {
		System.out.println("This is services Controller!");
		return "services";
	}

	@RequestMapping("/help")
	public String help() {
		System.out.println("This is help Controller!");
		return "help";
	}
}
