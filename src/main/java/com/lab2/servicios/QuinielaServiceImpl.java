package com.lab2.servicios;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Quiniela;
import com.lab2.modelo.User;
import com.lab2.repositorio.QuinielaRepository;


@Service("quinielaService")
public class QuinielaServiceImpl implements QuinielaService{

	@Autowired
	private QuinielaRepository quinielaRepository;

	@Override
	public void saveQuiniela(Quiniela quiniela) {
		quinielaRepository.save(quiniela);
	}
	@Override
	public List<Quiniela> findAll() {
		return quinielaRepository.findAll();
	}
	@Override
	public Quiniela findByID(Integer id){
		return quinielaRepository.findByid(id);
	}
	
	@Override
	public boolean participaQuiniela(Integer id,User user){
		List<User> users = quinielaRepository.findByid(id).getUsers();
		for (User u : users) {
			if(user.equals(u))
			return true;
		}
		return false;

	}
	@Override
	public List<Quiniela> findByUser(User user) {
		List<Quiniela> quinielas = quinielaRepository.findByUsers(user);
		return quinielas;

	}
	@Override
	public List<Quiniela> findByAdmin(User user) {
		List<Quiniela> quinielas = quinielaRepository.findByAdmin(user);
		return quinielas;

	}
}