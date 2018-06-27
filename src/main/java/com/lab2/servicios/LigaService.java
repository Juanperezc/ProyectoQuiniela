package com.lab2.servicios;
import java.util.List;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Sport;

public interface LigaService{
	//public User findUserByEmail(String email);
	public void saveLiga(Liga liga);
	public Liga findByID(Integer id);
	public Liga saveAndFlush(Liga liga);
	public List<Liga> findBySport(Sport sport);
}