package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = { "/home", "/" })
	public String home(Model model) {
		model.addAttribute("name", "Pranjal Saxena");
		model.addAttribute("id", 12345);
		List<String> friends = new ArrayList<String>();
		friends.add("Abc");
		friends.add("Abc1");
		friends.add("Abc2");
		friends.add("Abc3");
		friends.add("Abc4");
		model.addAttribute("friends", friends);
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
