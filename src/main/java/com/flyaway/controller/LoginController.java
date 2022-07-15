package com.flyaway.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flyaway.model.Admin;
import com.flyaway.service.AdminService;

@Controller
public class LoginController {

	@Autowired
	AdminService adminService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("credentials", new Admin());
		mav.setViewName("login");

		return mav;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute Admin login) {
		ModelAndView mav = null;

		Admin admin = adminService.validateAdmin(login);

		if (null != admin) {
			mav = new ModelAndView("welcome");
			mav.addObject("username", admin.getUsername());
		} else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Username or Password is wrong!!");
		}

		return mav;
	}

	
	@RequestMapping(value = "/forgotpassword", method = RequestMethod.GET)
	public ModelAndView forgotpassword() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("newcredentials", new Admin());
		mav.setViewName("forgotpassword");

		return mav;
	}
	
	
	
	
	
	
	@RequestMapping(value = "/resetpassword", method = RequestMethod.GET)
	public ModelAndView forgotpassword(@ModelAttribute Admin update) {
		ModelAndView mav=null;
		int n = adminService.UpdatePassword(update);

		if(n!=0){
			mav = new ModelAndView("login");
			mav.addObject("credentials", new Admin());

		}else {
			mav = new ModelAndView("forgotpassword");
			mav.addObject("message", "Try Again!!");
		}

		return mav;
	}


}
