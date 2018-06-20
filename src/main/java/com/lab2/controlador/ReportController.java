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
public class ReportController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/admin-report" }, method = RequestMethod.GET)
	public ModelAndView adminreport() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/report/adminreport");
		return modelAndView;
	}

	@RequestMapping(value = { "/user-report" }, method = RequestMethod.GET)
	public ModelAndView userreport() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/report/userreport");
		return modelAndView;
	}

	@RequestMapping(value = {"/member-report" }, method = RequestMethod.GET)
	public ModelAndView memberreport() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/report/memberreport");
		return modelAndView;
	}

}