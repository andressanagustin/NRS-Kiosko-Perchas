package com.ws.perchas.quiebre.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.perchas.quiebre.stock.models.artsEc.AsItm;
import com.ws.perchas.quiebre.stock.repository.AsItmRepo;

@Service
public class AsItmService {
	@Autowired
	private AsItmRepo itemRepo;
	
	public String buscarItemsxCodigo(String cd_itm){
		String detalle = "";
		List<AsItm> respuesta = itemRepo.buscarItemsxCodigo(cd_itm);
		
		if(respuesta.size()>0)
			detalle = respuesta.get(0).getNm_itm();
		
		return detalle;
	}
	
	
}
