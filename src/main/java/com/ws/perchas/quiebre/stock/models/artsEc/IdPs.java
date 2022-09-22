package com.ws.perchas.quiebre.stock.models.artsEc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="id_ps", schema ="arts_ec")
public class IdPs {
	@Id
	private String id_itm_ps;
	
	@ManyToOne
	@JoinColumn(name = "id_itm", insertable = false, updatable = false)
	private AsItm asItm;
	
    private Integer id_bsn_un;
    
    
	public String getId_itm_ps() {
		return id_itm_ps;
	}
	public void setId_itm_ps(String id_itm_ps) {
		this.id_itm_ps = id_itm_ps;
	}
	public AsItm getAsItm() {
		return asItm;
	}
	public void setAsItm(AsItm asItm) {
		this.asItm = asItm;
	}
	public Integer getId_bsn_un() {
		return id_bsn_un;
	}
	public void setId_bsn_un(Integer id_bsn_un) {
		this.id_bsn_un = id_bsn_un;
	}
    
    
}
