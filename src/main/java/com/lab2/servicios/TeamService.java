package com.lab2.servicios;
import java.util.List;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Team;

public interface TeamService{
	//public User findUserByEmail(String email);
	public void saveTeam(Team team);
	public Team findTeamByName(String name);
	public Team findTeamByID(Integer id);
	public List<Team> findByLiga(Liga liga);
	
}