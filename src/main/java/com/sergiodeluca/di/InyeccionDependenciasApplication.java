package com.sergiodeluca.di;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sergiodeluca.di.atributo.Coche;
import com.sergiodeluca.di.atributo.Motor;
import com.sergiodeluca.di.profiles.EnvironmentService;
import com.sergiodeluca.di.scopes.EjemploScopeServices;

import qualifiers.Avion;
import qualifiers.Nido;
import qualifiers.Pajaro;
import qualifiers.Perro;

@SpringBootApplication
public class InyeccionDependenciasApplication {

	private static final Logger log = LoggerFactory.getLogger(InyeccionDependenciasApplication.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InyeccionDependenciasApplication.class, args);

		//EnvironmentService envService = context.getBean(EnvironmentService.class);
		
		//Coche coche = context.getBean(Coche.class);
		//System.out.println(coche);

		//log.info("Environment activo {}",envService.getEnvironment());
		
		EjemploScopeServices scope = context.getBean(EjemploScopeServices.class);
		EjemploScopeServices scope2 = context.getBean(EjemploScopeServices.class);
		
		log.info("Scopes equals {}",scope.equals(scope2));
		
		log.info("Scopes == {}",scope == scope2);
	

	}

}
