package com.lab2.servicios;
import java.util.List;

import com.lab2.modelo.Sport;

public interface SportService{
	//public User findUserByEmail(String email);
	public void saveSport(Sport sport);
	public List<Sport> findAll();
}