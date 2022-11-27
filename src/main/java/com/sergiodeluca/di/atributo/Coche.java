/**
 * 
 */
package com.sergiodeluca.di.atributo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author sergio
 *
 */

@Component
public class Coche {
	
	//@Value("VW")
	private String marca;
	
	//@Value("1982")
	private Integer modelo;
	
	
	//@Autowired()	//<--- inyeccion de dependencia por atributo
	private Motor motor;
	
	public Coche() {
	}
	
	
	//<--- inyeccion de dependencia por constructor
	//@Autowired()
	//public Coche(@Value("VW") String marca,@Value("1982") Integer modelo,@Autowired() Motor motor) {
	//	super();
	//	this.marca = marca;
	//	this.modelo = modelo;
	//	this.motor = motor;
	//}

	public String getMarca() {
		return marca;
	}

	@Value("VW")
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	@Value("1982")
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
	}

	public Motor getMotor() {
		return motor;
	}

	@Autowired()
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	

}
