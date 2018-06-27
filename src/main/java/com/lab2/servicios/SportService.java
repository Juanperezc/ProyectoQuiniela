package com.lab2.servicios;
import java.util.List;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Sport;

public interface SportService{
	//public User findUserByEmail(String email);
	public void saveSport(Sport sport);
	public Sport findSportByName(String name);
	public List<Sport> findAll();
	public List<Sport> findSportByLiga(Liga liga);
}