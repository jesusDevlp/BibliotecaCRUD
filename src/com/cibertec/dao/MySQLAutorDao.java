package com.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cibertec.beans.AutorDTO;
import com.cibertec.interfaces.AutorDao;
import com.cibertec.utils.MysqlDBConnection;

public class MySQLAutorDao implements AutorDao {

	@Override
	public List<AutorDTO> listarAutor() {
		AutorDTO aut = null;
		List<AutorDTO> data = new ArrayList<AutorDTO>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "select * from autor";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				aut = new AutorDTO();
				aut.setIdAutor(rs.getInt(1));
				aut.setNombreAutor(rs.getString(2));
				aut.setPaisAutor(rs.getString(3));
				data.add(aut);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();
				if (cn != null)
					cn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return data;
	}

	@Override
	public int registraAutor(AutorDTO autor) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "insert into autor values(null,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, autor.getNombreAutor());
			pstm.setString(2, autor.getPaisAutor());
			estado = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (pstm != null)
					pstm.close();
				if (cn != null)
					cn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public int actualizarAutor(AutorDTO autor) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "update autor set nombre_Autor=?, pais_Autor=? where id_Autor=?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, autor.getNombreAutor());
			pstm.setString(2, autor.getPaisAutor());
			pstm.setInt(3, autor.getIdAutor());
			estado = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (pstm != null)
					pstm.close();
				if (cn != null)
					cn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public AutorDTO buscarAutor(int cod) {
		AutorDTO aut = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "select * from autor where id_Autor=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			rs = pstm.executeQuery();
			if (rs.next()) {
				aut = new AutorDTO();
				aut.setIdAutor(rs.getInt(1));
				aut.setNombreAutor(rs.getString(2));
				aut.setPaisAutor(rs.getString(3));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();
				if (cn != null)
					cn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return aut;
	}

	@Override
	public int eliminarAutor(int cod) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "delete from autor where id_Autor=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			estado = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (pstm != null)
					pstm.close();
				if (cn != null)
					cn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

}
