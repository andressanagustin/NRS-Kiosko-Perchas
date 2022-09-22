package com.ws.perchas.quiebre.stock.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ws.perchas.quiebre.stock.service.AsItmService;
import com.ws.perchas.quiebre.stock.service.QsFechaTareaService;
import com.ws.perchas.quiebre.stock.service.QsTareaService;
import com.ws.perchas.quiebre.stock.service.UsUsuariosService;
import com.ws.perchas.quiebre.stock.models.quiebreEc.QsTarea;
import com.ws.perchas.quiebre.stock.models.response.TareaList;
import com.ws.perchas.quiebre.stock.models.response.UsuariosList;
import com.ws.perchas.quiebre.stock.models.saadmin.UsUsuarios;

import java.util.Date;
import java.util.List;
/*
@RestController
@RequestMapping("/PERCHAS/WS_PERCHAS.asmx")
public class QsController {
	
	@Autowired
	private UsUsuariosService usuarioService;
	@Autowired
	private QsTareaService tareaService;
	@Autowired
	private QsFechaTareaService fechatareaService;
	@Autowired
	private AsItmService itemService;
	
	private static final Log logger = LogFactory.getLog(QsController.class);
	
	
	//@GetMapping("/us")
	@RequestMapping(value="/us", method = RequestMethod.GET)
	public List<UsUsuarios> getUsuarios() {
		return usuarioService.listar();
	}
	
	//@GetMapping("/tareas")
	@RequestMapping(value="/tareas", method = RequestMethod.GET)
	public List<QsTarea> getTareas() {
		return tareaService.listar();
	}
	
	//@PostMapping("/slt_login")
	@RequestMapping(value="/slt_login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuariosList> ConsultaLogin(String ALIAS_USR, String CLAVE_USR) {	
		logger.info("Entro ConsultaLogin");
		ResponseEntity<UsuariosList> resp = null;
		try {
			UsuariosList lst_retorno = new UsuariosList();
			lst_retorno.setListaUsuario(usuarioService.buscarUsuarios(ALIAS_USR, CLAVE_USR));
			logger.info("Finalizo ConsultaLogin");
			resp = new ResponseEntity<UsuariosList>(lst_retorno,null,HttpStatus.OK);
		}catch(Exception ex) {
			logger.error(ex.getMessage(),ex);
			resp = new ResponseEntity<UsuariosList>(null,null,HttpStatus.BAD_REQUEST);
		}
		
		return resp;	
	}
	
	@RequestMapping(value="/slt_tareas_asig", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TareaList> ConsultaTareasAsignadas(@RequestParam String ID_USR) {	
		logger.info("Entro ConsultaTareasAsignadas");
		ResponseEntity<TareaList> resp = null;
		try {
			TareaList lst_retorno = tareaService.buscarTareasxUsu(ID_USR);
			logger.info("Finalizo ConsultaTareasAsignadas");
			resp = new ResponseEntity<TareaList>(lst_retorno,null,HttpStatus.OK);
		}catch(Exception ex) {
			logger.error(ex.getMessage(),ex);
			resp = new ResponseEntity<TareaList>(null,null,HttpStatus.BAD_REQUEST);
		}
		
		return resp;	
		
	}
	
	@RequestMapping(value="/int_solicitud", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> IngresoNuevaTarea(Integer CODIGO_USR, String CODIGO_PRD,Integer CANTIDAD_PROD, String PERCHA_DSL,String COD_TIENDA) {	
		logger.info("Entro IngresoNuevaTarea");
		ResponseEntity<Boolean> resp = null;
		try {
			// validar si ya esta cargado el pedido, no crear. validar por codigo de producto
			Date fechaActual = new Date();
			// sacamos el ultimo caracter porque viene el codigo de barra
			String cd_itm = CODIGO_PRD.substring(0, CODIGO_PRD.length()-1);
			String descripcion = itemService.buscarItemsxCodigo(cd_itm);
			Integer id = tareaService.agregarTarea(fechaActual, CODIGO_USR, CODIGO_PRD, CANTIDAD_PROD, PERCHA_DSL,COD_TIENDA,descripcion);
			boolean addFechaTarea = fechatareaService.agregarFechaTarea(id,fechaActual);
			logger.info("Finalizo IngresoNuevaTarea");
			resp = new ResponseEntity<Boolean>(addFechaTarea,null,HttpStatus.OK);
		}catch(Exception ex) {
			logger.error(ex.getMessage(),ex);
			resp = new ResponseEntity<Boolean>(null,null,HttpStatus.BAD_REQUEST);
		}
		
		return resp;	

	}
	
	@RequestMapping(value="/int_tareas_en_proceso", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> TareaEnProceso(@RequestParam String ID_TAREA) {	
		logger.info("Entro TareaEnProceso");
		ResponseEntity<Boolean> resp = null;
		try {
		// validar que este en estado 1
		// pasar a estado tarea en 2
			Boolean modificar = null;
			if(fechatareaService.editarTarea(ID_TAREA)) 
				modificar = tareaService.modificarEstado(ID_TAREA, 2);
			logger.info("Finalizo TareaEnProceso");
			resp = new ResponseEntity<Boolean>(modificar,null,HttpStatus.OK);
		}catch(Exception ex) {
			logger.error(ex.getMessage(),ex);
			resp = new ResponseEntity<Boolean>(null,null,HttpStatus.BAD_REQUEST);
		}
		
		return resp;	
	}
	
	@RequestMapping(value="/int_tareas_fin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> FinalizarTarea(@RequestParam String ID_TAREA) {	
		logger.info("Entro FinalizarTarea");
		ResponseEntity<Boolean> resp = null;
		try {
		// validar que este en estado 2
		// estado tarea en 3
			Boolean modificar = null;
			if(fechatareaService.finalizarTarea(ID_TAREA)) 
				modificar = tareaService.modificarEstado(ID_TAREA, 3);
			logger.info("Finalizo FinalizarTarea");
			resp = new ResponseEntity<Boolean>(modificar,null,HttpStatus.OK);
		}catch(Exception ex) {
			logger.error(ex.getMessage(),ex);
			resp = new ResponseEntity<Boolean>(null,null,HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
}*/
