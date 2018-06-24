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

import com.lab2.modelo.Liga;
import com.lab2.modelo.Sport;
import com.lab2.modelo.Team;
import com.lab2.modelo.User;
import com.lab2.servicios.LigaService;
import com.lab2.servicios.SportService;
import com.lab2.servicios.TeamService;
import com.lab2.servicios.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired private UserService userService;

    @Autowired private SportService sportService;

    @Autowired private LigaService ligaService;

    @Autowired private TeamService teamService;

    @RequestMapping(value = {
        "/myprofile"
    }, method = RequestMethod.GET)
    public ModelAndView profile() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/profile");
        return modelAndView;
    }
    @RequestMapping(value = {
        "/solicitudes"
    }, method = RequestMethod.GET)
    public ModelAndView request() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/request");
        return modelAndView;
    }
    @RequestMapping(value = {
        "/myleagues"
    }, method = RequestMethod.GET)
    public ModelAndView league() {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getAuthUser();
        modelAndView.addObject("leagues", user.getLigas());
        modelAndView.setViewName("user/myleague"); //
        return modelAndView;
    }

    @RequestMapping(value = {
        "/myleagues/{id}"
    }, method = RequestMethod.GET)
    public ModelAndView show(@PathVariable("id")Integer id) {
        Liga liga = ligaService.findByID(id);
        List<Sport> sports = sportService.findAll();
        //User admin = userService.findUserByid(quiniela.getAdmin());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("liga", liga);
        modelAndView.addObject("team", new Team());
        modelAndView.addObject("sports", sports);
        modelAndView.setViewName("user/league");
        return modelAndView;
    }

    @RequestMapping(value = {
        "/createteam/{id}"
    }, method = RequestMethod.POST)
    public ModelAndView saveTeam(
        @PathVariable("id")Integer id,
        @Valid Team team,
        BindingResult bindingResult
    ) {
        ModelAndView modelAndView = new ModelAndView();
        Team teamExists = teamService.findTeamByName(team.getName());
        if (teamExists != null) {
            bindingResult.rejectValue(
                "name",
                "error.team",
                "Ya existe un equipo con este nombre"
            );
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("pgadmin/sport");
        } else {
		
			Liga liga = ligaService.findByID(id);
            if (team.getId() != 0){
				Team teamlast = teamService.findTeamByID(team.getId());
				if (team.getImg().equals(""))
				team.setImg(teamlast.getImg());
			}
			team.setLiga(liga);
            teamService.saveTeam(team);
			modelAndView.addObject("liga", liga);
            modelAndView.addObject(
                "successMessage",
                "Los Datos se han guardado correctamente"
            );
        }

        List<Sport> sports = sportService.findAll();
        modelAndView.addObject("team", new Team());
        modelAndView.addObject("sports", sports);
        modelAndView.setViewName("user/league");
        return modelAndView;
    }

	
}