package com.cibertec.interfaces;

import java.util.List;

import com.cibertec.beans.AutorDTO;

public interface AutorDao {
	//metodos del crud
		public List<AutorDTO> listarAutor();
		public int registraAutor(AutorDTO autor);
		public int actualizarAutor(AutorDTO autor);
		public AutorDTO buscarAutor(int cod);
		public int eliminarAutor(int cod);
}
