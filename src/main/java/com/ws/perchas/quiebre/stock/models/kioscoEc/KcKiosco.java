package com.ws.perchas.quiebre.stock.models.kioscoEc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import com.ws.perchas.quiebre.stock.models.artsEc.AsItm;
import com.ws.perchas.quiebre.stock.models.artsEc.PaStrRtl;
//import com.ws.perchas.quiebre.stock.models.saadmin.MnTienda;

@Entity
@Table(name="kc_kiosco", schema ="kiosco_ec")
public class KcKiosco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer local; 
	private Integer tipo_negocio;
	private String descripcion;
	private String ip;
	private String mac; 
	private boolean estado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLocal() {
		return local;
	}
	public void setLocal(Integer local) {
		this.local = local;
	}
	public Integer getTipo_negocio() {
		return tipo_negocio;
	}
	public void setTipo_negocio(Integer tipo_negocio) {
		this.tipo_negocio = tipo_negocio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	} 
	  
}
