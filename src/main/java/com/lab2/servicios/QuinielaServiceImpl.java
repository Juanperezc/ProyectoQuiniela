package com.lab2.servicios;


import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Quiniela;
import com.lab2.repositorio.QuinielaRepository;


@Service("quinielaService")
public class QuinielaServiceImpl implements QuinielaService{

	@Autowired
	private QuinielaRepository quinielaRepository;

	@Override
	public void saveQuiniela(Quiniela quiniela) {
		quinielaRepository.save(quiniela);
	}

}