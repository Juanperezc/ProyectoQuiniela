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
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/account-management" }, method = RequestMethod.GET)
	public ModelAndView accountmanagement() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/admin/accountmanagement");
		return modelAndView;
	}
}