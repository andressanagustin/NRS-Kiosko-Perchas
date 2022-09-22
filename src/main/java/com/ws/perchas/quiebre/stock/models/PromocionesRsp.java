package com.ws.perchas.quiebre.stock.models;

import org.springframework.lang.Nullable;

public class PromocionesRsp {
	private String CODIGO_PRM;
	private String FECHA_CRE_PRM;
	private String FECHA_INI_PRM;
	private String FECHA_FIN_PRM;
	private int CODIGO_TIPO_NEGOCIO;
	private String CODIGO_CEN;
     
    public PromocionesRsp(String cODIGO_PRM, String fECHA_CRE_PRM, String fECHA_INI_PRM, String fECHA_FIN_PRM,
			int cODIGO_TIPO_NEGOCIO,@Nullable String cODIGO_CEN) {
		super();
		CODIGO_PRM = cODIGO_PRM;
		FECHA_CRE_PRM = fECHA_CRE_PRM;
		FECHA_INI_PRM = fECHA_INI_PRM;
		FECHA_FIN_PRM = fECHA_FIN_PRM;
		CODIGO_TIPO_NEGOCIO = cODIGO_TIPO_NEGOCIO;
		CODIGO_CEN = cODIGO_CEN;
	}
    
	public String getCODIGO_PRM() {
		return CODIGO_PRM;
	}
	public void setCODIGO_PRM(String cODIGO_PRM) {
		CODIGO_PRM = cODIGO_PRM;
	}
	public String getFECHA_CRE_PRM() {
		return FECHA_CRE_PRM;
	}
	public void setFECHA_CRE_PRM(String fECHA_CRE_PRM) {
		FECHA_CRE_PRM = fECHA_CRE_PRM;
	}
	public String getFECHA_INI_PRM() {
		return FECHA_INI_PRM;
	}
	public void setFECHA_INI_PRM(String fECHA_INI_PRM) {
		FECHA_INI_PRM = fECHA_INI_PRM;
	}
	public String getFECHA_FIN_PRM() {
		return FECHA_FIN_PRM;
	}
	public void setFECHA_FIN_PRM(String fECHA_FIN_PRM) {
		FECHA_FIN_PRM = fECHA_FIN_PRM;
	}
	public int getCODIGO_TIPO_NEGOCIO() {
		return CODIGO_TIPO_NEGOCIO;
	}
	public void setCODIGO_TIPO_NEGOCIO(int cODIGO_TIPO_NEGOCIO) {
		CODIGO_TIPO_NEGOCIO = cODIGO_TIPO_NEGOCIO;
	}
	public String getCODIGO_CEN() {
		return CODIGO_CEN;
	}
	public void setCODIGO_CEN(String cODIGO_CEN) {
		CODIGO_CEN = cODIGO_CEN;
	}
}
