package com.lab2.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.lab2.modelo.Liga;
import com.lab2.modelo.Sport;

@Repository("ligaRepository")
public interface LigaRepository extends JpaRepository<Liga, Integer>{
	//Liga findByRole(String role);
     Liga findByid(Integer id);
     List<Liga> findBySport(Sport sport);
}