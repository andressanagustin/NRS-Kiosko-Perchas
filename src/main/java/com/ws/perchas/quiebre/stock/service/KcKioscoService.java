package com.ws.perchas.quiebre.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.ws.perchas.quiebre.stock.models.ProductosRsp;
import com.ws.perchas.quiebre.stock.models.PromocionesRsp;
import com.ws.perchas.quiebre.stock.models.kioscoEc.KcKiosco;
import com.ws.perchas.quiebre.stock.models.response.ProductoList;
import com.ws.perchas.quiebre.stock.models.response.PromocionesList;
import com.ws.perchas.quiebre.stock.repository.KcKioscoRepo;


@Service
public class KcKioscoService {
	@Autowired
	private KcKioscoRepo kckioscoRepo;
	//@Autowired
	//private KioscoRepository kRepo;
	//throws Exception 
	public List<KcKiosco> listar(){
		//throw new Exception("Prueba");
		return kckioscoRepo.findAll();
	}
	
	public List<Integer> buscarKioscoxId(String IP_KIOSCO){
		return kckioscoRepo.buscarKioscoxId(IP_KIOSCO);
	}
	
	public List<Integer> buscarTipoNegocio(Integer CODIGO_CEN){
		return kckioscoRepo.buscarTipoNegocio(CODIGO_CEN);
	}
	public List<ProductosRsp> buscarProducto(String ean,String ip) throws Exception{
		List<ProductosRsp> resp = new ArrayList<ProductosRsp>();
		try {
			List<Object[]> listaProducto = kckioscoRepo.buscarProducto(ean,ip);
			listaProducto.forEach(tabla-> {
				ProductosRsp prm = new ProductosRsp(tabla[0].toString(), tabla[1].toString(), tabla[2].toString());
				resp.add(prm);
			});
		//return kckioscoRepo.buscarProducto(Long.parseLong(ean));
		//return kckioscoRepo.buscarProducto1(ip);
		//return kckioscoRepo.buscarProducto();
			
		}catch(Exception ex) {
			throw new Exception(ex);
		}
		return resp;
	}
	
}
