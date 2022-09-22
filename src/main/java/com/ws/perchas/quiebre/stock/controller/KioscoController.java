package com.ws.perchas.quiebre.stock.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ws.perchas.quiebre.stock.models.response.KioscoIdList;
import com.ws.perchas.quiebre.stock.models.response.KioscoList;
import com.ws.perchas.quiebre.stock.models.response.ProductoList;
import com.ws.perchas.quiebre.stock.models.response.PromocionesList;
import com.ws.perchas.quiebre.stock.models.response.UsuariosList;
import com.ws.perchas.quiebre.stock.service.KcKioscoService;
import com.ws.perchas.quiebre.stock.service.KcPublicidadService;

@RestController
@RequestMapping("/WS_KIOSCO_PRECIOS/WS_KIOSCO_PRECIOS.asmx")
public class KioscoController {
	
	@Autowired
	private KcKioscoService kioscoService;
	@Autowired
	private KcPublicidadService publicidadService;
	
	private static final Log logger = LogFactory.getLog(KioscoController.class);

	@RequestMapping(value="/slt_gn_centro", method = RequestMethod.GET)
    public ResponseEntity<KioscoList> consultaKiosco() {
		logger.info("Entro consultaKiosco");
		ResponseEntity<KioscoList> resp = null;
		try {
			KioscoList kioscoList = new KioscoList();
			kioscoList.setListaKioscos(kioscoService.listar());
			logger.info("Finalizo consultaKiosco");
			resp = new ResponseEntity<KioscoList>(kioscoList,null,HttpStatus.OK);
			//return ResponseEntity.ok(resp);
		}catch(Exception ex) {
			logger.error(ex.getMessage(),ex);
			resp = new ResponseEntity<KioscoList>(null,null,HttpStatus.BAD_REQUEST);
			//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se pudo consultar.\n");
		}
		return resp;
	}
	
	@RequestMapping(value="/slt_producto", method = RequestMethod.POST)
    public ResponseEntity<ProductoList> consultaProducto(String EAN, String IP_KIO) {
		logger.info("Entro consultaProducto");
		ResponseEntity<ProductoList> resp = null;
		try {
			ProductoList prodList = new ProductoList();
			prodList.setListaproductos(kioscoService.buscarProducto(EAN,IP_KIO));
			logger.info("Finalizo consultaProducto");
			resp = new ResponseEntity<ProductoList>(prodList,null,HttpStatus.OK);
			//return ResponseEntity.ok(resp);
		}catch(Exception ex) {
			logger.error(ex.getMessage(),ex);
			resp = new ResponseEntity<ProductoList>(null,null,HttpStatus.BAD_REQUEST);
			//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se pudo consultar.\n");
		}
		
		return resp;
	}
	
	@RequestMapping(value="/int_kiosko_mov", method = RequestMethod.POST)
    public ResponseEntity<KioscoIdList> insertarKioscoMov(@RequestParam String IP_KIOSCO) {
		logger.info("Entro insertarKioscoMov");
		ResponseEntity<KioscoIdList> resp = null;
		try {
			KioscoIdList kioscoList = new KioscoIdList();
			kioscoList.setListaid(kioscoService.buscarKioscoxId(IP_KIOSCO));
			logger.info("Finalizo insertarKioscoMov");
			resp = new ResponseEntity<KioscoIdList>(kioscoList,null,HttpStatus.OK);
		}catch(Exception ex) {
			logger.error(ex.getMessage(),ex);
			resp = new ResponseEntity<KioscoIdList>(null,null,HttpStatus.BAD_REQUEST);
			//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se pudo consultar.\n");
		}
		return resp;
	}
	
	@RequestMapping(value="/slt_promociones_mov", method = RequestMethod.POST)
    public ResponseEntity<PromocionesList> sincroSubidaPromo(@RequestParam Integer CODIGO_CEN) {
		logger.info("Entro sincroSubidaPromo");
		ResponseEntity<PromocionesList> resp = null;
		try {
			PromocionesList listaPublicidad = new PromocionesList();
			List<Integer> listTipoNegocio =  kioscoService.buscarTipoNegocio(CODIGO_CEN);
			if(!listTipoNegocio.isEmpty())
				listaPublicidad = publicidadService.buscarPublicidad(CODIGO_CEN, listTipoNegocio);
			logger.info("Finalizo sincroSubidaPromo");
			resp = new ResponseEntity<PromocionesList>(listaPublicidad,null,HttpStatus.OK);
		}catch(Exception ex) {
			logger.error(ex.getMessage(),ex);
			resp = new ResponseEntity<PromocionesList>(null,null,HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
}
