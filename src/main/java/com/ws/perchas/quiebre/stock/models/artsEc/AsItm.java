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

@Entity
@Table(name="as_itm", schema ="arts_ec")
public class AsItm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_itm;
	private String cd_itm;
	private String nm_itm;
	private String de_itm;
	private String de_descripcion;
	
	@OneToMany(mappedBy = "asItm", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<IdPs> idPs = new HashSet<>();
	
	@OneToMany(mappedBy = "asItm", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AsItmStr> asItmStr = new HashSet<>();
	
	public String getCd_itm() {
		return cd_itm;
	}
	public void setCd_itm(String cd_itm) {
		this.cd_itm = cd_itm;
	}
	public Long getId_itm() {
		return id_itm;
	}
	public void setId_itm(Long id_itm) {
		this.id_itm = id_itm;
	}
	public String getNm_itm() {
		return nm_itm;
	}
	public void setNm_itm(String nm_itm) {
		this.nm_itm = nm_itm;
	}
	public String getDe_itm() {
		return de_itm;
	}
	public void setDe_itm(String de_itm) {
		this.de_itm = de_itm;
	}
	public String getDe_descripcion() {
		return de_descripcion;
	}
	public void setDe_descripcion(String de_descripcion) {
		this.de_descripcion = de_descripcion;
	}
}
