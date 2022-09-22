package com.ws.perchas.quiebre.stock.repository;

import java.util.Date;
//import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ws.perchas.quiebre.stock.models.quiebreEc.QsTarea;

@Repository
public interface QsTareaRepo extends JpaRepository<QsTarea, Integer>{
	//id,fechacreacion,id_item,descripcion,cantidad,percha,usr_creador,usr_asignado,estado
	@Query("SELECT u FROM QsTarea u WHERE u.usr_asignado = :idUsu and (u.estado = 1 or u.estado = 2)")
	List<QsTarea> buscarTareasxUsu(@Param("idUsu") String idUsu);
	
	@Query("SELECT u FROM QsTarea u WHERE u.id_item = :idItem and cod_tienda = :codTienda and u.estado in(0,1,2)")
	List<QsTarea> buscarTareasxCodTienda(@Param("idItem") String idItem, @Param("codTienda") Integer codTienda);
	
	//UPDATE QUIEBRE_EC.DBO.QS_TAREA SET ESTADO = 2 WHERE ID = @ID_TAREA; UPDATE  QUIEBRE_EC.DBO.QS_FECHA_TAREA SET fechaproceso = GETDATE() WHERE ID = @ID_TAREA 
	//Insert into QUIEBRE_EC.DBO.QS_TAREA(fechacreacion, id_item, cantidad, percha, usr_creador, estado) VALUES(@fecha, @CODIGO_PRD, @CANTIDAD_PROD, @PERCHA_DSL, @CODIGO_USR, 0);
	//@Query("Insert into QsTarea(fechacreacion, id_item, cantidad, percha, usr_creador, estado) VALUES(:fecha, :codigo_prd, :cantidad_prd, :percha_dsl, :codigo_usr, 0)")
	//boolean insertarTarea(@Param("fecha") Date fecha,@Param("codigo_usr") Integer codigo_usr,@Param("codigo_prd") String codigo_prd,@Param("cantidad_prd") Long cantidad_prod,@Param("percha_dsl") String percha_dsl);
}
