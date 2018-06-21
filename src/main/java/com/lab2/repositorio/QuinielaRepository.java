package com.lab2.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab2.modelo.Quiniela;

@Repository("quinielaRepository")
public interface QuinielaRepository extends JpaRepository<Quiniela, Integer>{
	//Quiniela findByRole(String role);

}