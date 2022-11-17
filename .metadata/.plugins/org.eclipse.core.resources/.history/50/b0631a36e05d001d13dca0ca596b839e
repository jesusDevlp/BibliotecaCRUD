package com.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cibertec.beans.LoginDTO;
import com.cibertec.interfaces.LoginDao;
import com.cibertec.utils.MysqlDBConnection;

public class MySQLLoginDao implements LoginDao {

	@Override
	public LoginDTO iniciarSesion(String log, String pas) {
		LoginDTO obj = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from login where usuario=? and clave=?";
			cn = MysqlDBConnection.getConexion();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1,log);
			pstm.setString(2, pas);
			rs = pstm.executeQuery();
			if(rs.next()) {
				obj = new LoginDTO();
				obj.setUsuario(rs.getString(1));;
				obj.setClave(rs.getString(2));							  
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					rs.close();
				if (cn != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		return obj;
	}

}
