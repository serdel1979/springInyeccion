package com.sergiodeluca.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sergiodeluca.di.atributo.Coche;
import com.sergiodeluca.di.atributo.Motor;

@SpringBootApplication
public class InyeccionDependenciasApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InyeccionDependenciasApplication.class, args);
	
		Coche coche = context.getBean(Coche.class);
		System.out.println(coche);
	}

}
