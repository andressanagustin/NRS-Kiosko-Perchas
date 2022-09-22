package com.ws.perchas.quiebre.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.perchas.quiebre.stock.models.Usuarios;
import com.ws.perchas.quiebre.stock.models.saadmin.UsUsuarios;
import com.ws.perchas.quiebre.stock.repository.UsUsuariosRepo;

@Service
public class UsUsuariosService {


	@Autowired
	private UsUsuariosRepo usuariosRepo;
	
	public List<UsUsuarios> listar(){
		return usuariosRepo.findAll();
	}
	
	public List<Usuarios> buscarUsuarios(String alias_usr, String clave_usr) throws Exception{
		List<Usuarios> listUser =  new ArrayList<Usuarios>();
		//List<UsUsuarios> listUsuarios = usuariosRepo.buscarUsuarios(alias_usr, clave_usr);
		try {
			List<Object[]> listUsuarios =  usuariosRepo.buscarUsuarios(alias_usr, clave_usr);
			
			listUsuarios.forEach(tabla->{
				Usuarios user = new Usuarios(tabla[0].toString(),tabla[1].toString());
				listUser.add(user);
			});
			
		}catch(Exception ex) {
			//logger.error(ex.getMessage());
			throw new Exception(ex);
		}
		return listUser;
	}
	
}
