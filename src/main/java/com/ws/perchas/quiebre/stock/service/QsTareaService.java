package com.ws.perchas.quiebre.stock.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.ws.perchas.quiebre.stock.repository.QsTareaRepo;
import com.ws.perchas.quiebre.stock.controller.QsController;
import com.ws.perchas.quiebre.stock.models.Tarea;
import com.ws.perchas.quiebre.stock.models.Usuarios;
import com.ws.perchas.quiebre.stock.models.quiebreEc.QsFechaTarea;
import com.ws.perchas.quiebre.stock.models.quiebreEc.QsTarea;
import com.ws.perchas.quiebre.stock.models.response.TareaList;

@Service
public class QsTareaService{

	@Autowired
	private QsTareaRepo qstareaRepo;
	
	private static final Log logger = LogFactory.getLog(QsTareaService.class);
	
	public List<QsTarea> listar(){
		return qstareaRepo.findAll();
	}
	
	public TareaList buscarTareasxUsu(String idUsu) throws Exception{
		TareaList listTareas = new TareaList();
		try {
			List<QsTarea> listRepo =  qstareaRepo.buscarTareasxUsu(idUsu);
			//(String id, String fechacreacion, String id_itm, String descripcion, String cantidad, String percha,String usr_creador, String usr_asignado, String estado
			listRepo.forEach(tabla->{
				Tarea tarea = new Tarea(tabla.getId().toString(),tabla.getFechacreacion().toString(),tabla.getId_item(),tabla.getDescripcion(),tabla.getCantidad().toString(),tabla.getPercha(),tabla.getUsr_creador(),tabla.getUsr_asignado(),tabla.getEstado().toString());
				listTareas.add(tarea);
			});
		}catch(Exception ex) {
			//logger.error(ex.getMessage());
			throw new Exception(ex);
		}
		return listTareas;
	}
	
	public Integer agregarTarea(Date fechaActual, Integer CODIGO_USR, String CODIGO_PRD,Integer CANTIDAD_PROD, String PERCHA_DSL, String COD_TIENDA, String descripcion) throws Exception {
		//CODIGO_PRD id_ps codigo de barra.
		Integer resp;
		try {
			QsTarea tarea = null;
			List<QsTarea> tareas = qstareaRepo.buscarTareasxCodTienda(CODIGO_PRD, Integer.parseInt(COD_TIENDA));
			if(!tareas.isEmpty()) {
				tarea = tareas.get(0);
			}
			//Date fechaActual = new Date();
			if(tarea == null) {
				tarea = new QsTarea();
				tarea.setId_item(CODIGO_PRD);
				tarea.setDescripcion(descripcion);
				tarea.setPercha(PERCHA_DSL);
				tarea.setUsr_creador(CODIGO_USR.toString());
				tarea.setFechacreacion(fechaActual);
				tarea.setCod_tienda(Integer.parseInt(COD_TIENDA));
				tarea.setEstado(0);
				tarea.setSolicitudes(1);
			}else {
				tarea.setSolicitudes(tarea.getSolicitudes()+1);
				tarea.setFecha_ultima_sol(fechaActual);
			}
			tarea.setCantidad(CANTIDAD_PROD);
			QsTarea QsTareaResp = qstareaRepo.save(tarea);
			resp = QsTareaResp.getId();
		}catch(Exception ex) {
			throw new Exception(ex);
		}
		
		return resp;
	}
	
	public boolean modificarEstado(String ID_TAREA, Integer estado)  throws Exception {
		boolean resp = false;
		try {
			QsTarea tarea = qstareaRepo.findById(Integer.parseInt(ID_TAREA)).get();
			tarea.setEstado(estado);
			qstareaRepo.save(tarea);
			resp = true;
		}catch(Exception ex) {
			//logger.error(ex.getMessage());
			throw new Exception(ex);
		}
		
		return resp;
	}
	
	
}
