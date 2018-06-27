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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lab2.modelo.User;
import com.lab2.repositorio.UserRepository;
import com.lab2.servicios.UserService;
import com.lab2.modelo.Game;
import com.lab2.modelo.Liga;
import com.lab2.modelo.Quiniela;
import com.lab2.modelo.Request;
import com.lab2.modelo.Rule;
import com.lab2.servicios.LigaService;
import com.lab2.servicios.QuinielaService;
import com.lab2.servicios.RequestService;
import com.lab2.servicios.RuleService;
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

	@Autowired
	private RequestService requestService;

	@Autowired
	private RuleService ruleService;
	@Autowired
	private LigaService ligaService;


	@RequestMapping(value = { "/show/{id}" }, method = RequestMethod.GET)
	public ModelAndView show(@PathVariable("id") Integer id) {
		Quiniela quiniela = quinielaService.findByID(id);
		User user = userService.getAuthUser();
		List<User> users = userService.findByQuiniela(quiniela);
		//User admin = userService.findUserByid(quiniela.getAdmin());

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("quiniela", quiniela);
		modelAndView.addObject("users",users);
		boolean esta=quinielaService.participaQuiniela(id,user);
		modelAndView.addObject("esta",esta);
		Request requestQ = requestService.isrequestQuiniela(quiniela,user);
		modelAndView.addObject("requestQ", requestQ);
	//	modelAndView.addObject("admin", admin);
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

	@RequestMapping(value = { "/joinrequest/{id}" }, method = RequestMethod.POST)
	public ModelAndView joinrequest(@PathVariable("id") Integer id) {
		
		User user = userService.getAuthUser();
		Quiniela quiniela = quinielaService.findByID(id);
		ModelAndView modelAndView = new ModelAndView();
		/* List<User> users = quiniela.getUsers();
		users.add(user);
		quiniela.setUsers(users); */
		//List<Quiniela> quinielas = user.getQuinielas();
		user.addQuiniela(quiniela);
		//quinielas.add(quiniela);
		//user.setQuinielas(quiniela);
		userService.saveNew(user);
		return new ModelAndView("redirect:/quiniela/show/"+id.toString());
	}

	@RequestMapping(value = { "/joinpriv/{id}" }, method = RequestMethod.POST)
	public ModelAndView joinpriv(@PathVariable("id") Integer id, 
	@RequestParam("user_id")Integer user_id,@RequestParam("state")Integer state) {
		
		User user = userService.findUserByid(user_id);
		Quiniela quiniela = quinielaService.findByID(id);
		boolean participando=true;
		ModelAndView modelAndView = new ModelAndView();
		Request request = requestService.findByUsuarioAndQuiniela(user, quiniela);
		request.setState(state);
		requestService.saveRequest(request);
		if(state==3){
			user.addQuiniela(quiniela);

			userService.saveNew(user);	
		}

		return new ModelAndView("redirect:/user/request");
	}

	@RequestMapping(value = { "/show" }, method = RequestMethod.GET)
	public ModelAndView show() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("quiniela/show");
		return modelAndView;
	}
	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		User user = userService.getAuthUser();
		List<Quiniela> quinielas = quinielaService.findByUser(user);
		modelAndView.addObject("quinielas",quinielas);
		modelAndView.setViewName("quiniela/index");
		return modelAndView;
	}
	@RequestMapping(value = { "/myindex" }, method = RequestMethod.GET)
	public ModelAndView myindex() {
		User user = userService.getAuthUser();
		List<Quiniela> quinielas = quinielaService.findByAdmin(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("quinielas", quinielas);
		modelAndView.setViewName("quiniela/myindex");
		return modelAndView;
	}

	@RequestMapping(value = {"/create" }, method = RequestMethod.GET)
	public ModelAndView getcreate() {
		List<Sport> sports = sportService.findAll();
		ModelAndView modelAndView = new ModelAndView();
	    Quiniela quiniela = new Quiniela();
		modelAndView.addObject("quiniela", quiniela);
		modelAndView.addObject("sports", sports);
		modelAndView.addObject("edit", false);
		modelAndView.addObject("editroute", "/quiniela/create");
		modelAndView.setViewName("quiniela/create");
		return modelAndView;
	}

	@RequestMapping(value = {"/create" }, method = RequestMethod.POST)
	public ModelAndView savecreate(@Valid Quiniela quiniela, BindingResult bindingResult) {
		List<Sport> sports = sportService.findAll();
		User user = userService.getAuthUser();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("sports", sports);
		modelAndView.addObject("edit", false);
		modelAndView.addObject("editroute", "/quiniela/create");
		quiniela.setAdmin(user);
	
	
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("quiniela/create");
		} else {
			//quiniela.setRule();
			

			//quiniela.setRule(rule);
			Quiniela qui = quinielaService.saveAndFlush(quiniela);
			Rule rule = new Rule();
			rule.setTeamScore(quiniela.getRule().getTeamScore());
			rule.setVictorScore(quiniela.getRule().getVictorScore());
			rule.setQuiniela(qui);			
			ruleService.saveRule(rule);
			Integer id = (Integer)qui.getId();
		    String redirect = "/quiniela/edit/" + id.toString();
			return new ModelAndView("redirect:" + redirect);
		}
		return modelAndView;
	}
	
    @RequestMapping(value = {"/edit/{id}" }, method = RequestMethod.GET)
	public ModelAndView getcreate(@PathVariable("id") Integer id) {
		List<Sport> sports = sportService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		Quiniela quiniela = quinielaService.findByID(id);
		List<Liga> ligas = ligaService.findBySport(quiniela.getSport());
		modelAndView.addObject("quiniela", quiniela);
		modelAndView.addObject("sports", sports);
		modelAndView.addObject("ligas", ligas);
		modelAndView.addObject("game", new Game());
		modelAndView.addObject("edit", true);
		modelAndView.addObject("editroute", "/quiniela/edit/" + id.toString());

		modelAndView.setViewName("quiniela/create");
		return modelAndView;
	}

	@RequestMapping(value = {"/edit/{id}" }, method = RequestMethod.POST)
	public ModelAndView setcreate(@PathVariable("id") Integer id, 
	@Valid Quiniela quiniela, BindingResult bindingResult) {
		List<Sport> sports = sportService.findAll();
		User user = userService.getAuthUser();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("quiniela", quiniela);
		modelAndView.addObject("sports", sports);
		modelAndView.addObject("edit", true);
		modelAndView.addObject("editroute", "/quiniela/create");
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("quiniela/create");
		} else {
			Quiniela qui = quinielaService.saveAndFlush(quiniela);
		    String redirect = "/quiniela/edit/" + id.toString();
			return new ModelAndView("redirect:" + redirect);
		}
		return modelAndView;
	}

	@RequestMapping(value = {"/create/game/{id}" }, method = RequestMethod.POST)
	public ModelAndView setcreategame(@PathVariable("id") Integer id, 
	@Valid Game game, BindingResult bindingResult) {
		List<Sport> sports = sportService.findAll();
		User user = userService.getAuthUser();
		ModelAndView modelAndView = new ModelAndView();
		Quiniela quiniela = quinielaService.findByID(id);
		modelAndView.addObject("quiniela", quiniela);
		modelAndView.addObject("sports", sports);
		modelAndView.addObject("edit", true);
		modelAndView.addObject("game", game);
		modelAndView.addObject("editroute", "/quiniela/create");
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("quiniela/create");
		} else {
			 game.setQuiniela(quiniela);
			 quiniela.addGame(game);
			 quinielaService.saveAndFlush(quiniela);
		    String redirect = "/quiniela/edit/" + id.toString();
			return new ModelAndView("redirect:" + redirect);
		}
		return modelAndView;
	}

}