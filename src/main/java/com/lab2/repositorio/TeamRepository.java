package com.lab2.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Team;

@Repository("teamRepository")
public interface TeamRepository extends JpaRepository<Team, Integer>{
	//Team findByRole(String role);
	Team findByName(String sport);
	Team findByid(Integer id);
	List<Team> findByLiga(Liga liga);
}