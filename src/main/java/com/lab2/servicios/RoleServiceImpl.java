package com.lab2.servicios;


import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Role;
import com.lab2.repositorio.RoleRepository;


@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void saveRole(Role Role) {
		roleRepository.save(Role);
	}

	@Override
	public Role findByName(String role) {
		return roleRepository.findByRole(role);
	}

}