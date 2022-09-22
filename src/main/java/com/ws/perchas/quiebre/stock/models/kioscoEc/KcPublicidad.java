package com.ws.perchas.quiebre.stock.models.kioscoEc;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kc_publicidad", schema ="kiosco_ec")
public class KcPublicidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date fechacreacion;
	private Date fechainicio;
	private Date fechafin;
	private String img_path;
	private String img_nombre;
	private String nombre;
	private Integer tipo_negocio;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public Date getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public String getImg_nombre() {
		return img_nombre;
	}
	public void setImg_nombre(String img_nombre) {
		this.img_nombre = img_nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTipo_negocio() {
		return tipo_negocio;
	}
	public void setTipo_negocio(Integer tipo_negocio) {
		this.tipo_negocio = tipo_negocio;
	}
	
	
}
