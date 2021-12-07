package io.casestudy.farmerservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greeting {
    
	@RequestMapping("/farmer")
	public @ResponseBody String greeting() {
		return "Hello world from Farmer";
	}
}
