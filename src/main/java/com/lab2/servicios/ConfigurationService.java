package com.lab2.servicios;
import com.lab2.modelo.Configuration;;

public interface ConfigurationService{
	public void saveConfiguration(Configuration configuration);
	public Configuration findConfigurationByid(Integer id);
}