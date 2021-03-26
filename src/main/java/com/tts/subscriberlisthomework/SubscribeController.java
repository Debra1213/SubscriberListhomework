package com.tts.subscriberlisthomework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubscribeController {
	
	@GetMapping
	public String index(Subscriber subscriber) {
		return "index";
}
}
