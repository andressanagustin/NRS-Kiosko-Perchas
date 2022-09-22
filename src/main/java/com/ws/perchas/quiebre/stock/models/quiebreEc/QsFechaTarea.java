package com.ws.perchas.quiebre.stock.models.quiebreEc;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qs_fecha_tarea", schema ="quiebre_ec")
public class QsFechaTarea {
	
	@Id
	private Integer id;
	private Date fechacreacion;
	private Date fechaasignacion;
	private Date fechaproceso;
	private Date fechafin;
	
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
	public Date getFechaasignacion() {
		return fechaasignacion;
	}
	public void setFechaasignacion(Date fechaasignacion) {
		this.fechaasignacion = fechaasignacion;
	}
	public Date getFechaproceso() {
		return fechaproceso;
	}
	public void setFechaproceso(Date fechaproceso) {
		this.fechaproceso = fechaproceso;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
}
