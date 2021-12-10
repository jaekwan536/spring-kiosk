package yuhan.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
	
	@RequestMapping("/top")
	public String top() { 
		
		return "top";
	}
	
	@RequestMapping("/main")
	public String main() { 
		
		return "main";
	}
}