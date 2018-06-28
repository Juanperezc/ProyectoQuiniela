package com.lab2.controlador;

import java.util.List;
import java.util.Map;

import com.lab2.modelo.Sport;
import com.lab2.modelo.Team;
import com.lab2.modelo.Liga;
import com.lab2.modelo.Quiniela;
import com.lab2.modelo.User;
import com.lab2.modelo.Request;
import com.lab2.repositorio.LigaRepository;
import com.lab2.repositorio.UserRepository;
import com.lab2.servicios.QuinielaService;
import com.lab2.servicios.RequestService;
import com.lab2.servicios.SportService;
import com.lab2.servicios.TeamService;
import com.lab2.servicios.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation. *;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired UserRepository userRepository;

    @Autowired private QuinielaService quinielaService;

    @Autowired private SportService sportService;

    @Autowired private UserService userService;
    @Autowired private RequestService requestService;
    @Autowired private TeamService teamService;

    @Autowired private LigaRepository ligaService;
    @RequestMapping("/users")
    public List<User> getAllusers() {
        return userRepository.findAll();
    }
    @RequestMapping("/quinielas")
    public List<Quiniela> geindextAllQuinielas() {
        return quinielaService.findAll();
	}
	@RequestMapping("/request")
    public List<Request> geindextAllRequest() {
        return requestService.findAllRequests();
	}
	@RequestMapping("/request/from/me")
    public List<Request> getAllRequestofme() {
	return requestService.getFromByUser();//
	}
	@RequestMapping("/request/to/me")
    public List<Request> getAllRequesttome() {
	return requestService.getToByUser();
    }
    @RequestMapping("/sports")
    public List<Sport> getAllSport() {
        return sportService.findAll();
    }
    @RequestMapping("/team/liga/{id}")
    public List<Team> getSportbyLiga(@PathVariable("id")Integer id) {
        Liga liga = ligaService.findByid(id);
    return teamService.findByLiga(liga);
    }
    @RequestMapping("/user/{id}/leagues")
    public List<Liga> getAllLigas(@PathVariable("id")Integer id) {
        List<Liga> liga = userRepository
            .findByid(id)
            .getLigas();
        return liga;
    }
    @RequestMapping("/user/me")
    public User getUserme() {
        return userService.getAuthUser();
    }

    @RequestMapping("/user/quiniela")
    public List<Quiniela> getQuinielas() {
        User user = userService.getAuthUser();
        return user.getQuinielas();
    }
    

    @RequestMapping("/user/participando/{id}")
    public boolean getQuinielasUser(@PathVariable("id") Integer id) {
        User user = userService.getAuthUser();
        return quinielaService.participaQuiniela(id, user);
    }

  /*  @RequestMapping("/user/quiniela")
    public Object getQuinielas() {
        User user = userService.getAuthUser();
        return user.getQuinielas();
    }*/
    @RequestMapping("/count/quinielas")
    public Map<String, String> countquinielas() {
   return quinielaService.countTypeQuinielas();
//return map;
    }
    @RequestMapping("/count/users")
    public Map<String, String> countusers() {
   return userService.countTypeUser();
//return map;
    }

///api/team/liga/
    // Get All Notes Create a new Note Get a Single Note Update a Note Delete a Note
}