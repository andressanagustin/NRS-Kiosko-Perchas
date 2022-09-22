package com.ws.perchas.quiebre.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ws.perchas.quiebre.stock.models.artsEc.AsItm;


@Repository
public interface AsItmRepo extends JpaRepository<AsItm, Long>{
	
	@Query("SELECT i FROM AsItm i WHERE i.cd_itm = :codigo ")
	List<AsItm> buscarItemsxCodigo(@Param("codigo") String cd_itm);


}
