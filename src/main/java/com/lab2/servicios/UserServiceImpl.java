package com.lab2.servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Quiniela;
import com.lab2.modelo.Role;
import com.lab2.modelo.User;
import com.lab2.repositorio.RoleRepository;
import com.lab2.repositorio.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;
    @Autowired private RoleRepository roleRepository;
    @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    @Override public User findUserByid(Integer id) {
        return userRepository.findByid(id);
    }
    @Override public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
		Role userRole = roleRepository.findByRole("USER");
		user.addRole(userRole);
     //   user.setRoles(new List<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }

    @Override public void saveNew(User user) {
        userRepository.save(user);
    }

    @Override public User getAuthUser() {
        Authentication auth = SecurityContextHolder
            .getContext()
            .getAuthentication();
        String email = (String)auth.getName();
        User user = userRepository.findByEmail(email);
        return user;
    }
	@Override
	public List<User> findByQuiniela(Quiniela quiniela) {
		return userRepository.findByQuinielas(quiniela);
	}
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
    }
	@Override
	public List<User> findAllWithoutAdmin() {
        List<User> users = new ArrayList<>();
		for (User u : findAll()) {
            if(u.getId()!=1)
                users.add(u);
        }
        return users;
	}
    

}