package com.lab2.controlador;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lab2.modelo.User;
import com.lab2.servicios.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = {"/myprofile"}, method = RequestMethod.GET)
	public ModelAndView profile() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user/profile");
		return modelAndView;
	}
	@RequestMapping(value = {"/myleague" }, method = RequestMethod.GET)
	public ModelAndView league() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user/league");
		return modelAndView;
	}

}