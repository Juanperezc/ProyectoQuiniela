package com.lab2.servicios;


<<<<<<< HEAD
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
=======
import java.util.ArrayList;
>>>>>>> 96e073d47f26b05b48266ea0b78806673d692efd
import java.util.List;
import java.util.Map;

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
	public Quiniela saveAndFlush(Quiniela quiniela) {
		return quinielaRepository.saveAndFlush(quiniela);
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
<<<<<<< HEAD
	public Map<String, String> countTypeQuinielas() {
		HashMap<String, String> map = new HashMap<>();
		List<Quiniela> q1 = quinielaRepository.findByType(1);
		List<Quiniela> q2 = quinielaRepository.findByType(2);
		Integer qpri = (Integer)q1.size();
		Integer qpu = (Integer)q2.size();
        map.put("public", qpri.toString());
        map.put("private", qpu.toString());
        return map;
    }
=======
	public List<Quiniela> findByUser(User user) {
		List<Quiniela> quinielas = quinielaRepository.findByUsers(user);
		return quinielas;

	}
	@Override
	public List<Quiniela> findByAdmin(User user) {
		List<Quiniela> quinielas = quinielaRepository.findByAdmin(user);
		return quinielas;

	}
>>>>>>> 96e073d47f26b05b48266ea0b78806673d692efd
}