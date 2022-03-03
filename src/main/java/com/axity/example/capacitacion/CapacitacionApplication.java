package com.axity.example.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories("com.axity.example.capacitacion.persistence")
@EntityScan("com.axity.example.capacitacion.model")
public class CapacitacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapacitacionApplication.class, args);
	}

}
