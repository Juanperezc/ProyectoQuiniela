package com.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProyectoQuinielaApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProyectoQuinielaApplication.class, args);
  }
}