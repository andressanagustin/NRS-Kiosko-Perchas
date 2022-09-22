package com.ws.perchas.quiebre.stock.models.artsEc;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ws.perchas.quiebre.stock.models.kioscoEc.KcKiosco;

@Entity
@Table(name="pa_str_rtl", schema ="arts_ec")
public class PaStrRtl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_bsn_un;
	private String de_str_rt;
	private Integer cd_str_rt;
	
	public Integer getId_bsn_un() {
		return id_bsn_un;
	}
	public void setId_bsn_un(Integer id_bsn_un) {
		this.id_bsn_un = id_bsn_un;
	}
	public String getDe_str_rt() {
		return de_str_rt;
	}
	public void setDe_str_rt(String de_str_rt) {
		this.de_str_rt = de_str_rt;
	}
	public Integer getCd_str_rt() {
		return cd_str_rt;
	}
	public void setCd_str_rt(Integer cd_str_rt) {
		this.cd_str_rt = cd_str_rt;
	}
}
