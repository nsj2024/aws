package com.ust.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
	
	@GetMapping("/greet")
	public String Message()
	{
		return "Ola! coma sova";
	}

}
