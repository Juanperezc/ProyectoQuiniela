package com.lab2.controlador;

import java.util.List;
import com.lab2.modelo.Sport;
import com.lab2.modelo.Liga;
import com.lab2.modelo.Quiniela;
import com.lab2.modelo.User;
import com.lab2.modelo.Request;
import com.lab2.repositorio.UserRepository;
import com.lab2.servicios.QuinielaService;
import com.lab2.servicios.RequestService;
import com.lab2.servicios.SportService;
import com.lab2.servicios.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation. *;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired UserRepository userRepository;

    @Autowired private QuinielaService quinielaService;

    @Autowired private SportService sportService;

    @Autowired private UserService userService;
	@Autowired private RequestService requestService;
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
    // Get All Notes Create a new Note Get a Single Note Update a Note Delete a Note
}