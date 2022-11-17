package com.cibertec.services;

import java.util.List;

import com.cibertec.beans.LibroDTO;
import com.cibertec.dao.DaoFactory;
import com.cibertec.interfaces.LibroDao;
import com.cibertec.utils.Constantes;

public class LibroService {
	DaoFactory fabrica = DaoFactory.getDAOFactory(Constantes.origenDatosMySQL);
	LibroDao objLi = fabrica.getLibro();
	
	public List<LibroDTO> listarLibro(){
		return objLi.listarLibro();
	}
	public int registraLibro(LibroDTO libro) {
		return objLi.registraLibro(libro);
	}
	public int actualizarLibro(LibroDTO libro) {
		return objLi.actualizarLibro(libro);
	}
	public LibroDTO buscarLibro(int cod) {
		return objLi.buscarLibro(cod);
	}
	public int eliminarLibro(int cod) {
		return objLi.eliminarLibro(cod);
	}
	public List<LibroDTO> librosAutor(String autor){
		return objLi.libroAutor(autor);
				
	}

}
