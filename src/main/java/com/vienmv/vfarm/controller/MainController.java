package com.vienmv.vfarm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request) {
		return "client/fragments/footer";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		return "client/index";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		return "client/login";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(HttpServletRequest request) {
		return "client/register";
	}
	@RequestMapping(value = "/courses", method = RequestMethod.GET)
	public String course(HttpServletRequest request) {
		return "client/courses";
	}
}
