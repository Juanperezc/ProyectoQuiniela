package com.lab2.servicios;
import java.util.List;

import com.lab2.modelo.Quiniela;

public interface QuinielaService{
	public List<Quiniela> findAll();
	public void saveQuiniela(Quiniela quiniela);
	public Quiniela findByID(Integer ID);
}