package com.lab2.servicios;
import com.lab2.modelo.Liga;

public interface LigaService{
	//public User findUserByEmail(String email);
	public void saveLiga(Liga liga);
	public Liga findByID(Integer id);
	public Liga saveAndFlush(Liga liga);
}