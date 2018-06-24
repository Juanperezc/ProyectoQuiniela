package com.lab2.controlador;

import java.util.List;
import com.lab2.modelo.Sport;
import com.lab2.modelo.Liga;
import com.lab2.modelo.Quiniela;
import com.lab2.modelo.User;
import com.lab2.repositorio.UserRepository;
import com.lab2.servicios.QuinielaService;
import com.lab2.servicios.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private QuinielaService quinielaService;

	@Autowired
	private SportService sportService;


	@RequestMapping("/users")
	public List<User> getAllusers() {
		return userRepository.findAll();
	}
	@RequestMapping("/quinielas")
	public List<Quiniela> getAllQuinielas() {
		return quinielaService.findAll();
	}
	@RequestMapping("/sports")
	public List<Sport> getAllSport() {
		return sportService.findAll();
	}

	@RequestMapping("/user/{id}/leagues")
	public List<Liga> getAllLigas(@PathVariable("id") Integer id) {
		List<Liga> liga = userRepository.findByid(id).getLigas();
		return liga;
	}
	// Get All Notes

	// Create a new Note

	// Get a Single Note

	// Update a Note

	// Delete a Note
}