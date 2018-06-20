package com.lab2.servicios;


import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Rule;
import com.lab2.repositorio.RuleRepository;


@Service("ruleService")
public class RuleServiceImpl implements RuleService{

	@Autowired
	private RuleRepository ruleRepository;

	@Override
	public void saveRule(Rule rule) {
		ruleRepository.save(rule);
	}

}