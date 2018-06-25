package com.lab2.controlador;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lab2.modelo.Configuration;
import com.lab2.modelo.Role;
import com.lab2.modelo.User;
import com.lab2.modelo.Sport;
import com.lab2.servicios.ConfigurationService;
import com.lab2.servicios.RoleService;
import com.lab2.servicios.SportService;
import com.lab2.servicios.UserService;

@Controller
@RequestMapping("/pgadmin")
public class AdminController {

	@Autowired
	private UserService userService;
	@Autowired
	private ConfigurationService confiService;

	@Autowired
	private SportService sportService;

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = { "/account-management" }, method = RequestMethod.GET)
	public ModelAndView accountmanagement() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("pgadmin/account-management");
		return modelAndView;
	}
	@RequestMapping(value = { "/sport" }, method = RequestMethod.GET)
	public ModelAndView sport() {

		ModelAndView modelAndView = new ModelAndView();
		List<Sport> sports = sportService.findAll();
		Sport sport = new Sport();
		modelAndView.addObject("sport", sport);
		modelAndView.addObject("sports", sports);
		modelAndView.setViewName("pgadmin/sport");
		return modelAndView;
	}
	@RequestMapping(value = { "/config" }, method = RequestMethod.GET)
	public ModelAndView pageconfig() {
		ModelAndView modelAndView = new ModelAndView();
		Configuration configuration = confiService.findConfigurationByid(1);
		modelAndView.addObject("configuration", configuration);
		modelAndView.setViewName("pgadmin/page-config");
		return modelAndView;
	}

	@RequestMapping(value = { "/sport" }, method = RequestMethod.POST)
	public ModelAndView saveSport(@Valid Sport sport, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();


		Sport sportExists = sportService.findSportByName(sport.getName());
		if (sportExists != null) {
			bindingResult.rejectValue("name", "error.sport",
					"Ya existe un deporte con este nombre");
		}
		if (!bindingResult.hasErrors()) {
			sportService.saveSport(sport);
			modelAndView.addObject("sport", new Sport());
			modelAndView.addObject("successMessage", "Los Datos se han guardado correctamente");
		}
		List<Sport> sports = sportService.findAll();
		modelAndView.addObject("sports", sports);
		modelAndView.setViewName("pgadmin/sport");
		return modelAndView;
	}
	@RequestMapping(value = { "/config" }, method = RequestMethod.POST)
	public ModelAndView saveCarousel(@Valid Configuration configuration, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		Configuration configlast = confiService.findConfigurationByid(1);
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("pgadmin/page-config");
		} else {
			configuration.setId(1);
			if (configuration.getImg1().equals(""))
			configuration.setImg1(configlast.getImg1());
			if (configuration.getImg2().equals(""))
			configuration.setImg2(configlast.getImg2());
			if (configuration.getImg3().equals(""))
			configuration.setImg3(configlast.getImg3());
			confiService.saveConfiguration(configuration);
			modelAndView.addObject("configuration", configuration);
			modelAndView.addObject("successMessage", "Los Datos se han guardado correctamente");
			modelAndView.setViewName("pgadmin/page-config");

		}
		return modelAndView;
	}

	/* @RequestMapping(value = { "/request/{id}" }, method = RequestMethod.POST)
	public ModelAndView joinpriv(@PathVariable("id") Integer id) {
		
		User user = userService.findUserByid(id);
		List<Role> roles = new ArrayList<>();
		Role role = roleService.findByName("ADMIN");
		roles.add(role);
		user.setRoles(roles);
		Quiniela quiniela = quinielaService.findByID(id);
		ModelAndView modelAndView = new ModelAndView();
		Request request = requestService.findByUsuarioAndQuiniela(user, quiniela);
		//List<Quiniela> quinielas = user.getQuinielas();
		request.setState(3);
		requestService.saveRequest(request);
		user.addQuiniela(quiniela);
		//quinielas.add(quiniela);
		//user.setQuinielas(quiniela);
		userService.saveNew(user);
		return new ModelAndView("redirect:/quiniela/show/"+id.toString());
	} */
	
}