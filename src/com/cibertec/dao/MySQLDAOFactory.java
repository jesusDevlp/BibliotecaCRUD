package com.cibertec.dao;

import com.cibertec.interfaces.AutorDao;
import com.cibertec.interfaces.ClienteDao;
import com.cibertec.interfaces.LibroDao;
import com.cibertec.interfaces.LoginDao;
import com.cibertec.interfaces.PrestamoDao;

public class MySQLDAOFactory extends DaoFactory {

	@Override
	public LoginDao getLLogin() {
		// TODO Auto-generated method stub
		return new MySQLLoginDao();
	}

	@Override
	public ClienteDao getCliente() {
		// TODO Auto-generated method stub
		return new MySQLClienteDao();
	}

	@Override
	public LibroDao getLibro() {
		// TODO Auto-generated method stub
		return new MySQLLibroDao();
	}

	@Override
	public PrestamoDao getPrestamo() {
		// TODO Auto-generated method stub
		return new MySQLPrestamoDao();
	}

	@Override
	public AutorDao getAutor() {
		// TODO Auto-generated method stub
		return new MySQLAutorDao();
	}

}
