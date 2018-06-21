package com.lab2.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lab2.modelo.User;
import com.lab2.servicios.UserService;
import com.lab2.modelo.Quiniela;
import com.lab2.servicios.QuinielaService;
import com.lab2.modelo.Sport;
import com.lab2.servicios.SportService;
@Controller
@RequestMapping("/quiniela")
public class QuinielaController {

	@Autowired
	private UserService userService;
	@Autowired
	private QuinielaService quinielaService;

	@Autowired
	private SportService sportService;

	@RequestMapping(value = { "/show/{id}" }, method = RequestMethod.GET)
	public ModelAndView show(@PathVariable("id") Integer id) {
		Quiniela quiniela = quinielaService.findByID(id);
		User admin = userService.findUserByid(quiniela.getAdmin());		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("quiniela", quiniela);
		modelAndView.addObject("admin", admin);
		modelAndView.setViewName("quiniela/show");
		
		return modelAndView;
	}


	

	/*@RequestMapping(value = { "/me" }, method = RequestMethod.GET)
	public ModelAndView me() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User customUser = (User)auth.getPrincipal();
		int userId = customUser.getId();
		Quiniela quiniela = quinielaService.findByID(userId);
		User admin = userService.findUserByid(quiniela.getAdmin());		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("quinielas", quiniela);
		modelAndView.addObject("admin", admin);
		modelAndView.setViewName("/quiniela/index");
		
		return modelAndView;
	}*/

	@RequestMapping(value = { "/joinrequest/{id}" }, method = RequestMethod.GET)
	public ModelAndView joinrequest(@PathVariable("id") Integer id) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User customUser = (User)auth.getPrincipal();
		int userId = customUser.getId();
		Quiniela quiniela = quinielaService.findByID(id);
		

		User admin = userService.findUserByid(quiniela.getAdmin());		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("quiniela", quiniela);
		modelAndView.addObject("admin", admin);
		modelAndView.setViewName("quiniela/show");
		return modelAndView;
	}

	@RequestMapping(value = { "/","/index" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quiniela/index");
		return modelAndView;
	}
	@RequestMapping(value = { "/","/myindex" }, method = RequestMethod.GET)
	public ModelAndView myindex() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quiniela/myindex");
		return modelAndView;
	}

	@RequestMapping(value = {"/create" }, method = RequestMethod.GET)
	public ModelAndView create() {
		List<Sport> allsports = sportService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("sports", allsports);
		modelAndView.setViewName("quiniela/create");
		return modelAndView;
	}

	

}