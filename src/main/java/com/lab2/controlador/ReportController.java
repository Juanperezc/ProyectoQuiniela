package com.lab2.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lab2.modelo.Quiniela;
import com.lab2.modelo.User;
import com.lab2.servicios.QuinielaService;
import com.lab2.servicios.UserService;

@Controller
@RequestMapping("/report")
public class ReportController {

	@Autowired
	private UserService userService;

	@Autowired
	private QuinielaService quinielaService;

	@RequestMapping(value = { "/admin" }, method = RequestMethod.GET)
	public ModelAndView adminreport() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/report/admin");
		return modelAndView;
	}

	@RequestMapping(value = { "/user" }, method = RequestMethod.GET)
	public ModelAndView userreport() {
		User user = userService.getAuthUser();
		List<Quiniela> quinielas = quinielaService.findByUser(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("quinielas", quinielas);
		modelAndView.setViewName("/report/user");
		return modelAndView;
	}	

	@RequestMapping(value = {"/member"}, method = RequestMethod.GET)
	public ModelAndView memberreport() {
		User user = userService.getAuthUser();
		List<Quiniela> quinielas = quinielaService.findByAdmin(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("quinielas", quinielas);
		modelAndView.setViewName("/report/member");
		return modelAndView;
	}

}