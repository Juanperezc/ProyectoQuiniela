package com.lab2;

import com.lab2.propiedades.FileStorageProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

@EnableConfigurationProperties({
  FileStorageProperties.class
})
public class ProyectoQuinielaApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProyectoQuinielaApplication.class, args);
  }
}