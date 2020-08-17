package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
	@RequestMapping("/")
	public String test() {
		System.out.println("ddddddd");
		System.out.println("cccccccc");
		test2();
		return "hello2 myspringboot";
	}
	
	public void test2() {
		System.out.println("2222222222");
	}
	

}
