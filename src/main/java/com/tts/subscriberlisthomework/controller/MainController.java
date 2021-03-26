package com.tts.subscriberlisthomework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{
	@RequestMapping("/hey")
	public String home( ) 
	{
		return "Hello World";
	}
	
}
