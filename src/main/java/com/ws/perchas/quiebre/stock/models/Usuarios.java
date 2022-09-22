package com.ws.perchas.quiebre.stock.models;

//import javax.persistence.Entity;
//import javax.persistence.Table;

//@Entity
//@Table(name="Usuarios")

public class Usuarios {	
	private String idusu;
	private String nombre;
	
	public Usuarios() {
		super();
	}
	public Usuarios(String idusu, String nombre) {
		super();
		this.idusu = idusu;
		this.nombre = nombre;
	}
	
	public String getIdusu() {
		return idusu;
	}
	public void setIdusu(String idusu) {
		this.idusu = idusu;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
}
