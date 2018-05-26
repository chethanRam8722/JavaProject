package com.demo.FirstSpringBootProject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan("com.demo")
public class Login {

	@RequestMapping( value="/login" , method={RequestMethod.GET,RequestMethod.POST})
	public String login( Model model, @RequestParam(value="name", required=false, defaultValue="World") String name ){
		model.addAttribute("name", name);
		return "login";
	}
}
