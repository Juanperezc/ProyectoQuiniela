package com.lab2.servicios;


import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Sport;
import com.lab2.repositorio.SportRepository;


@Service("sportService")
public class SportServiceImpl implements SportService{

	@Autowired
	private SportRepository ligaRepository;

	@Override
	public void saveSport(Sport sport) {
		ligaRepository.save(sport);
	}

}