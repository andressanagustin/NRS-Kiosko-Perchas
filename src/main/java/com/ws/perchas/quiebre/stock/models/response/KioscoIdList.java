package com.ws.perchas.quiebre.stock.models.response;

import java.util.ArrayList;
import java.util.List;

public class KioscoIdList {
	private List<Integer> listaid;

	public KioscoIdList() {
		super();
		this.setListaid(new ArrayList<Integer>());
	}

	public List<Integer> getListaid() {
		return listaid;
	}

	public void setListaid(List<Integer> listaid) {
		this.listaid = listaid;
	}
}
