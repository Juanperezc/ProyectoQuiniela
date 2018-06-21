package com.lab2.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab2.modelo.Configuration;

@Repository("configurationRepository")
public interface ConfigurationRepository extends JpaRepository<Configuration, Integer>{
	//Configuration findByRole(String role);

}