package com.ws.perchas.quiebre.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ws.perchas.quiebre.stock.models.kioscoEc.KcPublicidad;

@Repository
public interface KcPublicidadRepo extends JpaRepository<KcPublicidad, Integer>{
	//select n.img_nombre as CODIGO_PRM, n.fechacreacion as FECHA_CRE_PRM, n.fechainicio as FECHA_INI_PRM, n.fechafin as FECHA_FIN_PRM, 
	// @CODIGO_CEN as local from KIOSCO_EC.DBO.KC_PUBLICIDAD n where n.tipo_negocio in 
	//(select m.tipo_negocio from KIOSCO_EC.DBO.KC_KIOSCO m where local = @CODIGO_CEN group by tipo_negocio)
	@Query("SELECT n.img_nombre, n.fechacreacion,n.fechainicio,n.fechafin,n.tipo_negocio FROM KcPublicidad n WHERE n.tipo_negocio IN (:lisTipoNeg) ")
	List<Object[]> buscarPublicidad(@Param("lisTipoNeg") List<Integer> listTipoNegocio);
}
