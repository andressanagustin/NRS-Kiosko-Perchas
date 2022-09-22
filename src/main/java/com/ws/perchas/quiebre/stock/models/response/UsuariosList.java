package com.ws.perchas.quiebre.stock.models.response;

import java.util.ArrayList;
import java.util.List;

import com.ws.perchas.quiebre.stock.models.Usuarios;

public class UsuariosList {

	private List<Usuarios> listaUsuario;

	public UsuariosList() {
		super();
		this.listaUsuario = new ArrayList<Usuarios>();
	}
	
	public List<Usuarios> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuarios> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
}
