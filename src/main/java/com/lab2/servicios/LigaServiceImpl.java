package com.lab2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Sport;
import com.lab2.repositorio.LigaRepository;


@Service("ligaService")
public class LigaServiceImpl implements LigaService{

	@Autowired
	private LigaRepository ligaRepository;

	@Override
	public void saveLiga(Liga liga) {
		ligaRepository.save(liga);
	}
	public Liga findByID(Integer id){
		return ligaRepository.findByid(id);
	}
	public Liga saveAndFlush(Liga quiniela){
		return ligaRepository.saveAndFlush(quiniela);
	}
	public List<Liga> findBySport(Sport sport){
		return ligaRepository.findBySport(sport);
	}

}