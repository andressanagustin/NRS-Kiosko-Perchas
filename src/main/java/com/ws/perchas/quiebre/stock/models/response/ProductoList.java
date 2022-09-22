package com.ws.perchas.quiebre.stock.models.response;

import java.util.ArrayList;
import java.util.List;

import com.ws.perchas.quiebre.stock.models.ProductosRsp;
import com.ws.perchas.quiebre.stock.models.PromocionesRsp;

public class ProductoList {
	private List<ProductosRsp> listaproductos;

	public ProductoList() {
		super();
		this.setListaproductos(new ArrayList<ProductosRsp>());
	}

	public List<ProductosRsp> getListaproductos() {
		return listaproductos;
	}

	public void setListaproductos(List<ProductosRsp> listaproductos) {
		this.listaproductos = listaproductos;
	}


	public boolean add(ProductosRsp productos) {
		// TODO Auto-generated method stub
		return listaproductos.add(productos);
	}
}
