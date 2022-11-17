package com.cibertec.interfaces;

import java.util.List;

import com.cibertec.beans.ClienteDTO;

public interface ClienteDao {
	//metodos del crud
	public List<ClienteDTO> listarCliente();
	public int registraCliente(ClienteDTO cliente);
	public int actualizarCliente(ClienteDTO cliente);
	public ClienteDTO buscarCliente(int cod);
	public int eliminarCliente(int cod);
	public List<ClienteDTO> clientesDistrito(String nombre);
}
