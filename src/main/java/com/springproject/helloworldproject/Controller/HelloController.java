package com.springproject.helloworldproject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Student")
public class HelloController
{
	@RequestMapping("/hello")
	String hello()
	{
		return "Spring boot  Rest Api hello world hello world";
	}
}