package com.lab2.servicios;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Team;
import com.lab2.repositorio.TeamRepository;


@Service("teamService")
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamRepository teamRepository;

	@Override
	public void saveTeam(Team team) {
		teamRepository.save(team);
	}
	@Override
	public Team findTeamByName(String name){
		return teamRepository.findByName(name);
	}
	@Override
	public Team findTeamByID(Integer id){
		return teamRepository.findByid(id);
	}
	@Override
	public List<Team> findByLiga(Liga liga){
		return teamRepository.findByLiga(liga);
	}
}