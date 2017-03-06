package com.zh.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zh.service.LoginService;


@Controller
@RequestMapping(value="/login")
public class LoginController {

	private Logger logger = Logger.getLogger(LoginController.class);
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/out")
	public String login(){
		logger.info("hello novalist");
		loginService.checkLoginInfo("hzhang", "hzhang");
		return "business";
	}
}
