package com.lab2.servicios;
import java.util.List;
import java.util.Map;

import com.lab2.modelo.Quiniela;
import com.lab2.modelo.User;

public interface QuinielaService{
	public List<Quiniela> findAll();
	public List<Quiniela> findByUser(User user);
	public List<Quiniela> findByAdmin(User user);
	public void saveQuiniela(Quiniela quiniela);
	public Quiniela saveAndFlush(Quiniela quiniela);
	public Quiniela findByID(Integer ID);
	public boolean participaQuiniela(Integer id,User user);
	public Map<String, String> countTypeQuinielas();
}