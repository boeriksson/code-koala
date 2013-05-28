package com.koala.web.controller;

import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView root(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping(headers ={"Accept=application/json"}, value = "/login", method = RequestMethod.POST)
	public @ResponseBody String login(HttpSession session) {
		System.out.println("I login");
		return "";
	}
	
}
