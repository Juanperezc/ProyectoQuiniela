package com.lab2.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab2.modelo.Game;

@Repository("gameRepository")
public interface GameRepository extends JpaRepository<Game, Integer>{
	//Game findByRole(String role);

}