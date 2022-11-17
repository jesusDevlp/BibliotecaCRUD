package com.cibertec.services;

import java.util.List;

import com.cibertec.beans.AutorDTO;
import com.cibertec.dao.DaoFactory;
import com.cibertec.interfaces.AutorDao;
import com.cibertec.utils.Constantes;

public class AutorService {
	DaoFactory fabrica = DaoFactory.getDAOFactory(Constantes.origenDatosMySQL);
	AutorDao objAut = fabrica.getAutor();

	public List<AutorDTO> listaAutor() {
		return objAut.listarAutor();

	}

	public int registrarAutor(AutorDTO autor) {
		return objAut.registraAutor(autor);
	}

	public int actualizaAutor(AutorDTO autor) {
		return objAut.actualizarAutor(autor);
	}

	public AutorDTO buscaAutor(int cod) {
		return objAut.buscarAutor(cod);
	}

	public int eliminaAutor(int cod) {
		return objAut.eliminarAutor(cod);
	}
}
