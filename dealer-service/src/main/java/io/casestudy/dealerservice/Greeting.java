package io.casestudy.dealerservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greeting {
	
    @RequestMapping("/dealer")
	public @ResponseBody String greeting() {
		return "Hello from Dealer"; 
	}
	

}
