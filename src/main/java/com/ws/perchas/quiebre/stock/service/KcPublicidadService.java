package com.ws.perchas.quiebre.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.perchas.quiebre.stock.models.PromocionesRsp;
import com.ws.perchas.quiebre.stock.models.response.PromocionesList;
import com.ws.perchas.quiebre.stock.repository.KcPublicidadRepo;

@Service
public class KcPublicidadService {
	
	@Autowired
	private KcPublicidadRepo kcpublicidadRepo;
	
	public PromocionesList buscarPublicidad(Integer CODIGO_CEN,List<Integer> listTipoNegocio) throws Exception{
		PromocionesList resp = new PromocionesList();
		try {
			List<Object[]> listaPublicidad = kcpublicidadRepo.buscarPublicidad( listTipoNegocio);
			listaPublicidad.forEach(tabla-> {
				PromocionesRsp prm = new PromocionesRsp(tabla[0].toString(), tabla[1].toString(), tabla[2].toString(), 
						tabla[3].toString(), (int)tabla[4],CODIGO_CEN.toString()); //, tabla[5].toString()
				resp.add(prm);
			});
			
		}catch(Exception ex) {
			throw new Exception(ex);
		}
		return resp;
	}

}
