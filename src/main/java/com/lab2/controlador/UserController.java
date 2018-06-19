package com.lab2.controlador;

import java.util.List;
import com.lab2.modelo.User;
import com.lab2.repositorio.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/users")
	public List<User> getAllusers() {
		return userRepository.findAll();
	}
	// Get All Notes

	// Create a new Note

	// Get a Single Note

	// Update a Note

	// Delete a Note
}