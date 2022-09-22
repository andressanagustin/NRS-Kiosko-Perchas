package com.ws.perchas.quiebre.stock.service;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.perchas.quiebre.stock.models.quiebreEc.QsFechaTarea;
import com.ws.perchas.quiebre.stock.repository.QsFechaTareaRepo;

@Service
public class QsFechaTareaService {

	@Autowired
	private QsFechaTareaRepo qsfechatareaRepo;
	
	private static final Log logger = LogFactory.getLog(QsFechaTareaService.class);
	
	public boolean agregarFechaTarea(Integer id,Date fechaActual) throws Exception {
		boolean resp = false;
		try {		
			QsFechaTarea fechaTarea = new QsFechaTarea();
			fechaTarea.setId(id);
			fechaTarea.setFechacreacion(fechaActual);
			qsfechatareaRepo.save(fechaTarea);
			resp = true;
		}catch(Exception ex) {
			//logger.error(ex.getMessage());
			throw new Exception(ex);
		}
		
		return resp;
	}
	
	
	//UPDATE QUIEBRE_EC.DBO.QS_TAREA SET ESTADO = 2 WHERE ID = @ID_TAREA; UPDATE  QUIEBRE_EC.DBO.QS_FECHA_TAREA SET fechaproceso = GETDATE() WHERE ID = @ID_TAREA 
	public boolean editarTarea(String ID_TAREA) throws Exception {
		boolean resp = false;
		
		try {
			Integer id = Integer.parseInt(ID_TAREA);
			QsFechaTarea fechaTarea = qsfechatareaRepo.findById(id).get();
			fechaTarea.setFechaproceso(new Date());
			qsfechatareaRepo.save(fechaTarea);
			resp = true;
		}catch(Exception ex) {
			//logger.error(ex.getMessage());
			throw new Exception(ex);
		}
		
		return resp;
	}
	
	//String sql = "UPDATE QUIEBRE_EC.DBO.QS_TAREA SET ESTADO = 3 WHERE ID = @ID_TAREA; UPDATE  QUIEBRE_EC.DBO.QS_FECHA_TAREA SET fechafin = GETDATE() WHERE ID = @ID_TAREA "; 
	public boolean finalizarTarea(String ID_TAREA) throws Exception {
		boolean resp = false;
		
		try {
			Integer id = Integer.parseInt(ID_TAREA);
			QsFechaTarea fechaTarea = qsfechatareaRepo.findById(id).get();
			fechaTarea.setFechafin(new Date());
			qsfechatareaRepo.save(fechaTarea);
			resp = true;
		}catch(Exception ex) {
			//logger.error(ex.getMessage());
			throw new Exception(ex);
		}
		
		return resp;
	}
}
