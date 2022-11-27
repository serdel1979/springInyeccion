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
public class Motor {
	
	//@Value("XL1")
	private String marca;
	
	//@Value("1980")
	private Integer modelo;
	
	
	public Motor() {	
	}
	
	//@Autowired()
	//public Motor(@Value("XL1") String marca, @Value("1990") Integer modelo) {
	//	this.marca = marca;
	//	this.modelo = modelo;
	//}
	
	public String getMarca() {
		return marca;
	}
	
	@Value("XL1")
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public Integer getModelo() {
		return modelo;
	}
	
	@Value("1990") 
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	

}
