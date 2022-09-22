package com.ws.perchas.quiebre.stock.models.response;

import java.util.ArrayList;
import java.util.List;

import com.ws.perchas.quiebre.stock.models.Tarea;

public class TareaList {
	private List<Tarea> listaTarea;

	public TareaList() {
		super();
		this.setListaTarea(new ArrayList<Tarea>());
	}

	public List<Tarea> getListaTarea() {
		return listaTarea;
	}

	public void setListaTarea(List<Tarea> listaTarea) {
		this.listaTarea = listaTarea;
	}

	public boolean add(Tarea tarea) {
		// TODO Auto-generated method stub
		return listaTarea.add(tarea);
	}
}
