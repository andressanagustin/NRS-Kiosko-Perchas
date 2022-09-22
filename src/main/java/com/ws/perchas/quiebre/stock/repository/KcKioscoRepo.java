package com.ws.perchas.quiebre.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ws.perchas.quiebre.stock.models.kioscoEc.KcKiosco;

@Repository
public interface KcKioscoRepo extends JpaRepository<KcKiosco, Integer>{
	@Query("SELECT u.id FROM KcKiosco u WHERE u.ip = :idK ")
	List<Integer> buscarKioscoxId(@Param("idK") String IP_KIOSCO);

	@Query("SELECT m.tipo_negocio from KcKiosco m where m.local = :codigo group by m.tipo_negocio")
	List<Integer> buscarTipoNegocio(@Param("codigo") Integer CODIGO_CEN);
	
	@Query("SELECT a.nm_itm AS PROD_NOMBRE,i.sls_prc AS PROD_PRECIO, i.sls_prc AS PROD_PRECIO_R "
			+ "FROM  AsItm a JOIN a.idPs p JOIN a.asItmStr i "
			+ "WHERE p.id_bsn_un IN (SELECT t.id_bsn_un FROM KcKiosco k, PaStrRtl t WHERE k.local = t.cd_str_rt AND k.ip = :ip) "
			+ " AND i.id_bsn_un = p.id_bsn_un "
			+ " AND p.id_itm_ps = :ean ")
	List<Object[]> buscarProducto(@Param("ean") String ean,@Param("ip") String ip);		//WHERE a.id_itm = 231215 
	
	@Query("SELECT a.nm_itm AS PROD_NOMBRE,i.sls_prc/100 AS PROD_PRECIO, i.sls_prc/100 AS PROD_PRECIO_R "
			+ "FROM  AsItm a JOIN a.idPs p JOIN a.asItmStr i "
			+ "WHERE p.id_itm_ps = :ean")
	List<Object[]> buscarProducto(@Param("ean") Long ean);
	
	@Query("SELECT t FROM KcKiosco k, PaStrRtl t where k.local = t.cd_str_rt ")
	List<Object[]> buscarProducto();
}
