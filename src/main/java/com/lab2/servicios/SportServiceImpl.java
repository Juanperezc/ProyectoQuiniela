package com.lab2.servicios;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Sport;
import com.lab2.repositorio.SportRepository;


@Service("sportService")
public class SportServiceImpl implements SportService{

	@Autowired
	private SportRepository sportRepository;

	@Override
	public void saveSport(Sport sport) {
		sportRepository.save(sport);
	}
	@Override
	public List<Sport> findAll() {
		return sportRepository.findAll();
	}
	@Override
	public List<Sport> findSportByLiga(Liga liga) {
		return sportRepository.findByLiga(liga);
	}
	@Override
	public Sport findSportByName(String name){
		return sportRepository.findByName(name);
	}

	/*@PostConstruct
    private void iniDataForTesting() {

        //sport = new ArrayList<User>();

		Sport sport= new Sport();
		sport.setName("Tentis");
      

    }*/
}