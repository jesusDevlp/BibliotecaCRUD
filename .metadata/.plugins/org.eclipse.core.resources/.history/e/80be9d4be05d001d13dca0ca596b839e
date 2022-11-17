package com.cibertec.utils;
import java.sql.*;

public class MysqlDBConnection {
	
	public static Connection getConexion() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/proyecto ","root","mysql");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
		
	}

}
