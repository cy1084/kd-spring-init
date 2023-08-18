package com.web.team1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.team1.service.TestService;

@Controller
public class TestController {
	public TestController() {
		System.out.println("내 메모리 만들어지나?");
	}
	@Autowired
	private TestService testService;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "test";
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.GET)//GET, POST 등 다 됨
	@ResponseBody
	public String test2() {
		return "test2";
	}
}
