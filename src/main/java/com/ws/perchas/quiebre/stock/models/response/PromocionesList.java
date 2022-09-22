package com.ws.perchas.quiebre.stock.models.response;

import java.util.ArrayList;
import java.util.List;

import com.ws.perchas.quiebre.stock.models.PromocionesRsp;

public class PromocionesList {
	private List<PromocionesRsp> listaPromociones;

	public PromocionesList() {
		super();
		this.listaPromociones = new ArrayList<PromocionesRsp>();
	}
	
	public PromocionesList(List<PromocionesRsp> listaPromociones) {
		super();
		this.listaPromociones = listaPromociones;
	}
	
	public List<PromocionesRsp> getListaPromociones() {
		return listaPromociones;
	}

	public void setListaPromociones(List<PromocionesRsp> listaPromociones) {
		this.listaPromociones = listaPromociones;
	}

	public boolean add(PromocionesRsp promociones) {
		// TODO Auto-generated method stub
		return listaPromociones.add(promociones);
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return listaPromociones.isEmpty() ;
	}
	

}

