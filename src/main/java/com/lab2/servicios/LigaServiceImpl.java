package com.lab2.servicios;


import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Liga;
import com.lab2.repositorio.LigaRepository;


@Service("ligaService")
public class LigaServiceImpl implements LigaService{

	@Autowired
	private LigaRepository ligaRepository;

	@Override
	public void saveLiga(Liga liga) {
		ligaRepository.save(liga);
	}

}