package com.cibertec.services;

import com.cibertec.beans.LoginDTO;
import com.cibertec.dao.DaoFactory;
import com.cibertec.interfaces.LoginDao;
import com.cibertec.utils.Constantes;

public class LoginService {
	DaoFactory fabrica = DaoFactory.getDAOFactory(Constantes.origenDatosMySQL);
	LoginDao objLog = fabrica.getLLogin();
	
	public LoginDTO iniciarSesion(String log, String pas) {
		return objLog.iniciarSesion(log, pas);
		
	}

}
