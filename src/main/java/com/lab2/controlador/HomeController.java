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
import com.lab2.servicios.UserService;
import com.lab2.servicios.QuinielaService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	
	private QuinielaService quinielaService;


	@RequestMapping(value = { "/","/index" }, method = RequestMethod.GET)
	public ModelAndView index() {
		List<Quiniela> allquinielas = quinielaService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("quinielas", allquinielas);
		modelAndView.setViewName("/home/index-user");
		return modelAndView;
	}



}