package com.cibertec.services;

import java.util.List;

import com.cibertec.beans.ClienteDTO;
import com.cibertec.dao.DaoFactory;
import com.cibertec.interfaces.ClienteDao;
import com.cibertec.utils.Constantes;

public class ClienteService {
	DaoFactory fabrica = DaoFactory.getDAOFactory(Constantes.origenDatosMySQL);
	ClienteDao objCli = fabrica.getCliente();
	
	public List<ClienteDTO> listaCliente(){
		return objCli.listarCliente();
		
	}
	
	public int registrarCliente(ClienteDTO cliente) {
		return objCli.registraCliente(cliente);
	}
	
	public int actualizarCliente(ClienteDTO cliente) {
		return objCli.actualizarCliente(cliente);
	}
	
	public ClienteDTO buscarCliente(int cod) {
		return objCli.buscarCliente(cod);
	}
	
	public int eliminarCliente(int cod) {
		return objCli.eliminarCliente(cod);
	}

}
