package com.Springboot.sbnew.controller;

import com.Springboot.sbnew.model.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	static String Hello = "Welcome";

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public static String welcome(Model model) {
		return "TestWebPage.jsp";

	}
}
