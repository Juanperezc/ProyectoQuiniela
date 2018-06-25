package com.lab2.servicios;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Configuration;
import com.lab2.repositorio.ConfigurationRepository;

@Service("configurationService")
public class ConfigurationServiceImpl implements ConfigurationService {

    @Autowired private ConfigurationRepository configurationRepository;

    @Override public void saveConfiguration(Configuration configuration){
        configurationRepository.save(configuration);
    }
	@Override
	 public Configuration findConfigurationByid(Integer id) {
        return configurationRepository.findByid(id);
    }

}