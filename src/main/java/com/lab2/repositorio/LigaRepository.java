package com.lab2.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab2.modelo.Liga;

@Repository("ligaRepository")
public interface LigaRepository extends JpaRepository<Liga, Integer>{
	//Liga findByRole(String role);

}