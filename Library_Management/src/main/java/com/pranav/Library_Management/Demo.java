package com.pranav.Library_Management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo 
{
	
	
	@GetMapping("/bye")
	public String bye()
	{
		return "Test bye ";
	}
	

}
