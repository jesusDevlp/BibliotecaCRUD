package com.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cibertec.beans.PrestamoDTO;
import com.cibertec.interfaces.PrestamoDao;
import com.cibertec.utils.MysqlDBConnection;

public class MySQLPrestamoDao implements PrestamoDao {

	@Override
	public List<PrestamoDTO> listarPrestamo() {
		PrestamoDTO pre = null;
		List<PrestamoDTO> data = new ArrayList<PrestamoDTO>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			cn = MysqlDBConnection.getConexion();
			String sql = " select p.nro_Pedido, l.nom_Libro, c.nom_Cliente, p.fecha_Salida, p.fecha_Devolución, p.estado\r\n" + 
					"    from prestamo p inner join libro l\r\n" + 
					"    on p.id_Libro = l.id_libro join cliente c\r\n" + 
					"    on p.id_Cliente = c.id_Cliente";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				pre = new PrestamoDTO();
				pre.setNroPedido(rs.getInt(1));
				pre.setNombreLibro(rs.getString(2));;
				pre.setNombreCliente(rs.getString(3));
				pre.setFechaSalida(rs.getString(4));
				pre.setFechaDevolucion(rs.getString(5));
				pre.setEstado(rs.getString(6));
				data.add(pre);
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
	public int registraPrestamo(PrestamoDTO prestamo) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "insert into prestamo values(null,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, prestamo.getIdLibro());
			pstm.setInt(2, prestamo.getIdCliente());
			pstm.setString(3, prestamo.getFechaSalida());
			pstm.setString(4, prestamo.getFechaDevolucion());
			pstm.setString(5, prestamo.getEstado());
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
	public int actualizarPrestamo(PrestamoDTO prestamo) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = " update prestamo set id_Libro=?, id_Cliente=?, fecha_Salida=?, fecha_Devolución=?, estado=? where nro_Pedido=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, prestamo.getIdLibro());
			pstm.setInt(2, prestamo.getIdCliente());
			pstm.setString(3, prestamo.getFechaSalida());
			pstm.setString(4, prestamo.getFechaDevolucion());
			pstm.setString(5, prestamo.getEstado());
			pstm.setInt(6, prestamo.getNroPedido());
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
	public PrestamoDTO buscarPrestamo(int cod) {
		PrestamoDTO pre = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "select * from prestamo where nro_Pedido=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			rs = pstm.executeQuery();
			if (rs.next()) {
				pre = new PrestamoDTO();
				pre.setNroPedido(rs.getInt(1));
				pre.setNombreLibro(rs.getString(2));
				pre.setNombreCliente(rs.getString(3));
				pre.setFechaSalida(rs.getString(4));
				pre.setFechaDevolucion(rs.getString(5));
				pre.setEstado(rs.getString(6));
				

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
		return pre;
	}

	@Override
	public int eliminarPrestamo(int cod) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "delete from prestamo where nro_Pedido=?";
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
