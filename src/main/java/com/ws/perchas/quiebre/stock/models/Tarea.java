package com.ws.perchas.quiebre.stock.models;

public class Tarea {
	
	public String id;
    public String fechacreacion;
    public String id_itm;
    public String descripcion;
    public String cantidad;
    public String percha;
    public String usr_creador;
    public String usr_asignado;
    public String estado;
    
    public Tarea() {
		super();
	}
    
	public Tarea(String id, String fechacreacion, String id_itm, String descripcion, String cantidad, String percha,
			String usr_creador, String usr_asignado, String estado) {
		super();
		this.id = id;
		this.fechacreacion = fechacreacion;
		this.id_itm = id_itm;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.percha = percha;
		this.usr_creador = usr_creador;
		this.usr_asignado = usr_asignado;
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getId_itm() {
		return id_itm;
	}
	public void setId_itm(String id_itm) {
		this.id_itm = id_itm;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
