package com.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.cibertec.beans.LibroDTO;
import com.cibertec.interfaces.LibroDao;
import com.cibertec.utils.MysqlDBConnection;

public class MySQLLibroDao implements LibroDao {

	@Override
	public List<LibroDTO> listarLibro() {
		LibroDTO li = null;
		List<LibroDTO> data = new ArrayList<LibroDTO>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "select l.id_Libro, l.nom_Libro, l.editorial, a.nombre_Autor, g.nom_Genero, l.mum_Paginas, l.precio, l.estado\r\n" + 
					"    from libro l inner join autor a\r\n" + 
					"    on l.id_Autor = a.id_Autor join genero g\r\n" + 
					"    on l.id_Genero = g.id_Genero;";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				li = new LibroDTO();
				li.setIdLibro(rs.getInt(1));;
				li.setNomLibro(rs.getString(2));
				li.setEditorial(rs.getString(3));
				li.setNombreAutor(rs.getString(4));
				li.setNombreGenero(rs.getString(5));
				li.setNumPaginas(rs.getInt(6));
				li.setPrecio(rs.getDouble(7));
				li.setEstado(rs.getString(8));
				data.add(li);
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
	public int registraLibro(LibroDTO libro) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "insert into libro values(null,?,?,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, libro.getNomLibro());
			pstm.setString(2, libro.getEditorial());
			pstm.setInt(3, libro.getIdAutor());
			pstm.setInt(4, libro.getIdGenero());
			pstm.setInt(5, libro.getNumPaginas());
			pstm.setDouble(6, libro.getPrecio());
			pstm.setString(7, libro.getEstado());
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
	public int actualizarLibro(LibroDTO libro) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "update libro set nom_Libro=?, editorial=?, id_Autor=?, id_Genero=?, mum_Paginas=?,precio=?, estado=? where id_Libro=?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, libro.getNomLibro());
			pstm.setString(2, libro.getEditorial());
			pstm.setInt(3, libro.getIdAutor());
			pstm.setInt(4, libro.getIdGenero());
			pstm.setInt(5, libro.getNumPaginas());
			pstm.setDouble(6, libro.getPrecio());
			pstm.setString(7, libro.getEstado());
			pstm.setInt(8, libro.getIdLibro());
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
	public LibroDTO buscarLibro(int cod) {
		LibroDTO li = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql ="select * from libro where id_Libro=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			rs = pstm.executeQuery();
			if (rs.next()) {
				li = new LibroDTO();
				li.setIdLibro(rs.getInt(1));
				li.setNomLibro(rs.getString(2));
				li.setEditorial(rs.getString(3));
				li.setNombreAutor(rs.getString(4));
				li.setNombreGenero(rs.getString(5));
				li.setNumPaginas(rs.getInt(6));
				li.setPrecio(rs.getDouble(7));
				li.setEstado(rs.getString(8));
				li.setIdAutor(rs.getInt(4));
				li.setIdGenero(rs.getInt(5));
				

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
		return li;
	}

	@Override
	public int eliminarLibro(int cod) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "delete from libro where id_Libro=?";
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

	@Override
	public List<LibroDTO> libroAutor(String autor) {
		LibroDTO li = null;
		List<LibroDTO> data = new ArrayList<LibroDTO>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "select l.id_Libro, l.nom_Libro, l.editorial, a.nombre_Autor, g.nom_Genero, l.mum_Paginas, l.precio, l.estado\r\n" + 
					"    from libro l inner join autor a\r\n" + 
					"    on l.id_Autor = a.id_Autor join genero g\r\n" + 
					"    on l.id_Genero = g.id_Genero where a.nombre_Autor=?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, autor);
			rs = pstm.executeQuery();
			while (rs.next()) {
				li = new LibroDTO();
				li.setIdLibro(rs.getInt(1));;
				li.setNomLibro(rs.getString(2));
				li.setEditorial(rs.getString(3));
				li.setNombreAutor(rs.getString(4));
				li.setNombreGenero(rs.getString(5));
				li.setNumPaginas(rs.getInt(6));
				li.setPrecio(rs.getDouble(7));
				li.setEstado(rs.getString(8));
				data.add(li);
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

}
