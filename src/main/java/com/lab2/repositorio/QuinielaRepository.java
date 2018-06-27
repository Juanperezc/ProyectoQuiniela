package com.lab2.repositorio;



import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

import com.lab2.modelo.Quiniela;
import com.lab2.modelo.User;

@Repository("quinielaRepository")
public interface QuinielaRepository extends JpaRepository<Quiniela, Integer>{
	//Quiniela findByRole(String role);
	List<Quiniela> findAll(); 
	Quiniela findByid(Integer id);
	List<Quiniela> findByUsers(User user);
	List<Quiniela> findByAdmin(User user);

}