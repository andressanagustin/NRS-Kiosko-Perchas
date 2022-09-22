package com.ws.perchas.quiebre.stock.models.saadmin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mn_tienda", schema ="saadmin")
public class MnTienda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_tienda;
	private Integer des_clave;
	
	public Integer getCod_tienda() {
		return cod_tienda;
	}
	public void setCod_tienda(Integer cod_tienda) {
		this.cod_tienda = cod_tienda;
	}
	public Integer getDes_clave() {
		return des_clave;
	}
	public void setDes_clave(Integer des_clave) {
		this.des_clave = des_clave;
	}
	
}
