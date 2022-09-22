package com.ws.perchas.quiebre.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ws.perchas.quiebre.stock.models.saadmin.UsUsuarios;

@Repository
public interface UsUsuariosRepo extends JpaRepository<UsUsuarios, Long>{
	@Query("SELECT idusu, nombre FROM UsUsuarios u WHERE u.cuenta = :alias and u.clave = :pass and u.estado = 1")
	List<Object[]> buscarUsuarios(@Param("alias") String alias_usr,@Param("pass") String clave_usr);
	
}
