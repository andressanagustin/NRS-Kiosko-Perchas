package com.ws.perchas.quiebre.stock.models;

public class ProductosRsp {
	
	private String PROD_NOMBRE;
	private String PROD_PRECIO;
	private String PROD_PRECIO_R;
	
	public ProductosRsp(String pROD_NOMBRE, String pROD_PRECIO, String pROD_PRECIO_R) {
		super();
		PROD_NOMBRE = pROD_NOMBRE;
		PROD_PRECIO = pROD_PRECIO;
		PROD_PRECIO_R = pROD_PRECIO_R;
	}
	public ProductosRsp() {
		super();
	}
	
	public String getPROD_NOMBRE() {
		return PROD_NOMBRE;
	}
	public void setPROD_NOMBRE(String pROD_NOMBRE) {
		PROD_NOMBRE = pROD_NOMBRE;
	}
	public String getPROD_PRECIO() {
		return PROD_PRECIO;
	}
	public void setPROD_PRECIO(String pROD_PRECIO) {
		PROD_PRECIO = pROD_PRECIO;
	}
	public String getPROD_PRECIO_R() {
		return PROD_PRECIO_R;
	}
	public void setPROD_PRECIO_R(String pROD_PRECIO_R) {
		PROD_PRECIO_R = pROD_PRECIO_R;
	}
}
