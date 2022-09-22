package com.ws.perchas.quiebre.stock.models.saadmin;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="us_usuarios", schema ="saadmin")
public class UsUsuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusu;
	private String nombre;
	private String cuenta;
	private String clave;
	private String email;
	private Integer estado;
    private Integer idreg ;
    private Date fecha;
    private Integer su;
    private String cc_operador;
    private Integer fl_pass;
    private String tipo;
    private String img_path;
    @Column(unique=true,length=10)
    private Long num_cedula;
   
    public Long getIdusu() {
		return idusu;
	}
	public void setIdusu(Long idusu) {
		this.idusu = idusu;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Integer getIdreg() {
		return idreg;
	}
	public void setIdreg(Integer idreg) {
		this.idreg = idreg;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getSu() {
		return su;
	}
	public void setSu(Integer su) {
		this.su = su;
	}
	public String getCc_operador() {
		return cc_operador;
	}
	public void setCc_operador(String cc_operador) {
		this.cc_operador = cc_operador;
	}
	public Integer getFl_pass() {
		return fl_pass;
	}
	public void setFl_pass(Integer fl_pass) {
		this.fl_pass = fl_pass;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public Long getNum_cedula() {
		return num_cedula;
	}
	public void setNum_cedula(Long num_cedula) {
		this.num_cedula = num_cedula;
	}
}
