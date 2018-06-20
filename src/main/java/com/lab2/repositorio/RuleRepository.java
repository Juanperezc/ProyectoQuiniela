package com.lab2.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab2.modelo.Rule;

@Repository("ruleRepository")
public interface RuleRepository extends JpaRepository<Rule, Integer>{
	//Rule findByRule(String rule);

}