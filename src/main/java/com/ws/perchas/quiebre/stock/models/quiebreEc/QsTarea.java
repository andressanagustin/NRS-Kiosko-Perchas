package com.ws.perchas.quiebre.stock.models.quiebreEc;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qs_tarea", schema ="quiebre_ec")
public class QsTarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date fechacreacion;
	private Date fecha_ultima_sol;
    private String id_item;
    private String descripcion;
    private Integer cantidad;
    private String percha;
    private String usr_creador;
    private String usr_asignado;
    private Integer cod_tienda;
    private Integer estado;
    private Integer solicitudes;
    
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
	public String getId_item() {
		return id_item;
	}
	public void setId_item(String id_item) {
		this.id_item = id_item;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getPercha() {
		return percha;
	}
	public void setPercha(String percha) {
		this.percha = percha;
	}
	public String getUsr_creador() {
		return usr_creador;
	}
	public void setUsr_creador(String usr_creador) {
		this.usr_creador = usr_creador;
	}
	public String getUsr_asignado() {
		return usr_asignado;
	}
	public void setUsr_asignado(String usr_asignado) {
		this.usr_asignado = usr_asignado;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Integer getCod_tienda() {
		return cod_tienda;
	}
	public void setCod_tienda(Integer cod_tienda) {
		this.cod_tienda = cod_tienda;
	}
	public Date getFecha_ultima_sol() {
		return fecha_ultima_sol;
	}
	public void setFecha_ultima_sol(Date fecha_ultima_sol) {
		this.fecha_ultima_sol = fecha_ultima_sol;
	}
	public Integer getSolicitudes() {
		return solicitudes;
	}
	public void setSolicitudes(Integer solicitudes) {
		this.solicitudes = solicitudes;
	}
	
}
