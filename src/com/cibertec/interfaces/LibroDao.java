package com.cibertec.interfaces;

import java.util.List;
import com.cibertec.beans.LibroDTO;

public interface LibroDao {
	//metodos del crud
	public List<LibroDTO> listarLibro();
	public int registraLibro(LibroDTO libro);
	public int actualizarLibro(LibroDTO libro);
	public LibroDTO buscarLibro(int cod);
	public int eliminarLibro(int cod);
	public List<LibroDTO> libroAutor(String autor);

}
