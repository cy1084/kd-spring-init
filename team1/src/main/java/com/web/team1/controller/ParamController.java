package com.web.team1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.team1.service.ParamService;
import com.web.team1.vo.ParamVO;

@Controller
public class ParamController {
	
	@Autowired
	private ParamService paramService;
	
	@RequestMapping(value="/param", method=RequestMethod.GET)
	public String get(@ModelAttribute ParamVO param, Model model) {
		// log.info("name->"+param.getName());
		model.addAttribute("param",param);
		return "views/test/param-form-res";
	}
	
	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String post(@ModelAttribute ParamVO param, Model model) {
		model.addAttribute("param",param);
		return "views/test/param-form-res";
	}
	
	@RequestMapping(value="/ajax/param", method=RequestMethod.POST)
	@ResponseBody
	public ParamVO ajaxPost(@RequestBody ParamVO param) {
		return param;
	}
	
	@RequestMapping(value="/ajax/param", method=RequestMethod.POST)
	@ResponseBody
	public int insertParam(@RequestBody ParamVO param) {
		return paramService.insertParam(param);
	}
	
	@RequestMapping(value="/params", method=RequestMethod.GET)
	public List<ParamVO> getParams(ParamVO param) {
		return paramService.getParams();
	}
	
}
