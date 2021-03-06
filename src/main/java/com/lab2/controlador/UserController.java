package com.lab2.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Quiniela;
import com.lab2.modelo.Request;
import com.lab2.modelo.Sport;
import com.lab2.modelo.Team;
import com.lab2.modelo.User;
import com.lab2.servicios.LigaService;
import com.lab2.servicios.QuinielaService;
import com.lab2.servicios.RequestService;
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

    @Autowired private RequestService requestService;

    @Autowired private QuinielaService quinielaService;

    @RequestMapping(value = {
        "/myprofile"
    }, method = RequestMethod.GET)
    public ModelAndView profile() {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getAuthUser();
        modelAndView.addObject("user", user);
        Request request_admin = requestService.isrequestAdmin(user);
        modelAndView.addObject("request_admin", request_admin);
        modelAndView.setViewName("user/profile");
        return modelAndView;
    }
    @RequestMapping(value = {
        "/myprofile"
    }, method = RequestMethod.POST)
    public ModelAndView saveProfile(
        @RequestParam("name")String name,
        @RequestParam("lastName")String lastName
    ) {
        /// if (!bindingResult.hasErrors()) {
        User userl = userService.getAuthUser();
        userl.setName(name);
        userl.setLastName(lastName);
        userService.saveNew(userl);
        return new ModelAndView("redirect:/user/myprofile");
        //   } else {
        /*  ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("user", user);
            boolean request_admin = requestService.isrequestAdmin(user);
            modelAndView.addObject("request_admin", request_admin);
            modelAndView.setViewName("user/profile");
            return modelAndView;
        }*/

    }
    @RequestMapping(value = {
        "/request"
    }, method = RequestMethod.GET)
    public ModelAndView showrequest(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        List<Request> requests = requestService.getToByUser();
        modelAndView.addObject("requests", requests);
        modelAndView.setViewName("user/request");
        return modelAndView;
    }
    @RequestMapping(value = {
        "/request/{id}"
    }, method = RequestMethod.POST)
    public ModelAndView sendRequest(
        @PathVariable("id")Integer id,
        @RequestParam("type")Integer type,
        @RequestParam("quiniela_id")Integer quiniela_id
    ) {
        User from = userService.getAuthUser();
        User to = userService.findUserByid(id);
        Request request = new Request();
        request.setFromid(from);
        request.setToid(to);
        if (quiniela_id != 0) {
            Quiniela quiniela = quinielaService.findByID(quiniela_id);
            request.setQuiniela(quiniela);
        }
        request.setTipo(type);
        request.setState(1);
        requestService.saveRequest(request);
        String redirectUrl = "";
        if (type == 1) 
            redirectUrl = "/user/myprofile";
        else 
            redirectUrl = "/quiniela/show/" + quiniela_id.toString();
        
        return new ModelAndView("redirect:" + redirectUrl);
    }
    @RequestMapping(value = {
        "/myleagues"
    }, method = RequestMethod.GET)
    public ModelAndView league() {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getAuthUser();
        modelAndView.addObject("leagues", user.getLigas());
        modelAndView.addObject("request_admin", user.getLigas());
        modelAndView.setViewName("user/myleague"); //
        return modelAndView;
    }
    @RequestMapping(value = {
        "/myleagues/{id}"
    }, method = RequestMethod.GET)
    public ModelAndView showLeague(@PathVariable("id")Integer id) {
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
        "/myleagues"
    }, method = RequestMethod.POST)
    public ModelAndView saveLeague(@Valid Liga liga, BindingResult bindingResult) {
        List<Sport> sports = sportService.findAll();

        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getAuthUser();
        Liga ligaold = ligaService.findByID(liga.getId());
        liga.setTeams(ligaold.getTeams());
        liga.setUser(user);
        liga = ligaService.saveAndFlush(liga);
        modelAndView.addObject("liga", liga);
        modelAndView.addObject("team", new Team());
        modelAndView.addObject("sports", sports);
        Integer id = (Integer)liga.getId();
        String redirectUrl = "/user/myleagues/" + id.toString();
        return new ModelAndView("redirect:" + redirectUrl);
    }
    @RequestMapping(value = {
        "/myleagues/create"
    }, method = RequestMethod.POST)
    public String createLeague() {
        User user = userService.getAuthUser();
        Liga liga = new Liga();
        liga.setName("Mi Liga");
        liga.setUser(user);
        liga = ligaService.saveAndFlush(liga);
        Integer id = (Integer)liga.getId();
        String redirectUrl = "user/myleagues/" + id.toString();
        return "redirect:/" + redirectUrl;

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
        if (!bindingResult.hasErrors()) {

            if (team.getImg().equals("")) {
                team.setImg(null);
            }
            Liga liga = ligaService.findByID(id);
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

    @RequestMapping(value = {
        "/editteam/{id}"
    }, method = RequestMethod.POST)
    public ModelAndView editTeam(
        @PathVariable("id")Integer id,
        @Valid Team team,
        BindingResult bindingResult
    ) {
        ModelAndView modelAndView = new ModelAndView();
        Liga liga = ligaService.findByID(id);

        if (!bindingResult.hasErrors()) {

            team.setLiga(liga);
            teamService.saveTeam(team);

            modelAndView.addObject(
                "successMessage",
                "Los Datos se han guardado correctamente"
            );
        }
        modelAndView.addObject("liga", liga);
        List<Sport> sports = sportService.findAll();
        modelAndView.addObject("team", new Team());
        modelAndView.addObject("sports", sports);
        modelAndView.setViewName("user/league");
        return modelAndView;
    }
}