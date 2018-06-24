package com.lab2.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab2.modelo.Team;

@Repository("teamRepository")
public interface TeamRepository extends JpaRepository<Team, Integer>{
	//Team findByRole(String role);
	Team findByName(String sport);
}