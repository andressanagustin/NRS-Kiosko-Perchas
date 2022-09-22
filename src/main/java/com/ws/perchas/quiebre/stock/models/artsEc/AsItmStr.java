package com.ws.perchas.quiebre.stock.models.artsEc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="as_itm_str", schema ="arts_ec")
@IdClass(KeyAsItmStr.class)
public class AsItmStr {

	@Id
	private Long id_itm;
	
	@ManyToOne
	@JoinColumn(name = "id_itm", insertable = false, updatable = false)
	private AsItm asItm;
		
	@Id
	private Integer id_bsn_un;
	private Double sls_prc;
	
	
	public Long getId_itm() {
		return id_itm;
	}
	public void setId_itm(Long id_itm) {
		this.id_itm = id_itm;
	}
	public AsItm getAsItm() {
		return asItm;
	}
	public void setAsItm(AsItm asItm) {
		this.asItm = asItm;
	}
	
	public Double getSls_prc() {
		return sls_prc;
	}
	public void setSls_prc(Double sls_prc) {
		this.sls_prc = sls_prc;
	}
	public Integer getId_bsn_un() {
		return id_bsn_un;
	}
	public void setId_bsn_un(Integer id_bsn_un) {
		this.id_bsn_un = id_bsn_un;
	}
	
	
	
}
