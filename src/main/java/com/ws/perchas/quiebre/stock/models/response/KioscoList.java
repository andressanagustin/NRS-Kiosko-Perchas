package com.ws.perchas.quiebre.stock.models.response;

import java.util.ArrayList;
import java.util.List;

import com.ws.perchas.quiebre.stock.models.kioscoEc.KcKiosco;

public class KioscoList {
	private List<KcKiosco> listaKioscos;

	public KioscoList() {
		super();
		this.setListaKioscos(new ArrayList<KcKiosco>());
	}

	public List<KcKiosco> getListaKioscos() {
		return listaKioscos;
	}

	public void setListaKioscos(List<KcKiosco> listaKioscos) {
		this.listaKioscos = listaKioscos;
	}

}
