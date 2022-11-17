package com.cibertec.services;

import java.util.List;

import com.cibertec.beans.PrestamoDTO;
import com.cibertec.dao.DaoFactory;
import com.cibertec.interfaces.PrestamoDao;
import com.cibertec.utils.Constantes;

public class PrestamoService {
	DaoFactory fabrica = DaoFactory.getDAOFactory(Constantes.origenDatosMySQL);
	PrestamoDao objPre = fabrica.getPrestamo();
	
	
	public List<PrestamoDTO> listarPrestamo(){
		return objPre.listarPrestamo();
	}
	public int registraPrestamo(PrestamoDTO prestamo) {
		return objPre.registraPrestamo(prestamo);
	}
	public int actualizarPrestamo(PrestamoDTO prestamo) {
		return objPre.actualizarPrestamo(prestamo);
	}
	public PrestamoDTO buscarPrestamo(int cod) {
		return objPre.buscarPrestamo(cod);
	}
	public int eliminarPrestamo(int cod) {
		return objPre.eliminarPrestamo(cod);
	}

}
