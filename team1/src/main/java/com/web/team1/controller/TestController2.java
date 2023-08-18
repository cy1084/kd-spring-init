package com.web.team1.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j // log 찍기 위함
public class TestController2 {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getTest(@RequestParam("name") String name, Model model) {
		// @RequestParam("name")String name 백엔드에서 받는 것
		// Model model 전달할 페이지에 보내는 것
		// Model이라는 개념 -> 실제로는 request scope로 동작
		log.info(name);
		model.addAttribute("msg", name + "님, 안녕하세요"); // key 값- msg

		return "views/test/form-res";
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String postTest(@RequestParam("name") String name, Model model) {
		log.info(name);
		model.addAttribute("msg", name + "님, 안녕하세요"); 

		return "views/test/form-res";
	}

	@RequestMapping(value = "/ajax/test", method = RequestMethod.GET)
	@ResponseBody
	public String getAjax(@RequestParam("name") String name) {
		return name + "님, 안녕하세요";
	}
	
	@RequestMapping(value = "/ajax/test", method = RequestMethod.POST)
	@ResponseBody
	public String postAjax(@RequestBody Map<String,String> param) {
		return param.get("name") + "님, 안녕하세요";
		//@RequestBody -> GET 에서 쓸 수 없음, GET에는 받을 수 있는 body가 없기 때문
	}

}
