package com.lab2.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Sport;

@Repository("sportRepository")
public interface SportRepository extends JpaRepository<Sport, Integer>{
	//Sport findByRole(String role);
	Sport findByName(String sport);
	List<Sport> findByLiga(Liga liga);

}