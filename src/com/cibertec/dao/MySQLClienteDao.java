package com.cibertec.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.cibertec.beans.ClienteDTO;
import com.cibertec.interfaces.ClienteDao;
import com.cibertec.utils.MysqlDBConnection;


public class MySQLClienteDao implements ClienteDao {

	@Override
	public List<ClienteDTO> listarCliente() {
		ClienteDTO cli = null;
		List<ClienteDTO> data = new ArrayList<ClienteDTO>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "select * from cliente";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				cli = new ClienteDTO();
				cli.setIdCliente(rs.getInt(1));
				cli.setNomCliente(rs.getString(2));
				cli.setApeCliente(rs.getString(3));
				cli.setDni(rs.getInt(4));
				cli.setDireCliente(rs.getString(5));
				cli.setDistrito(rs.getString(6));
				cli.setFechaNaci(rs.getString(7));
				data.add(cli);
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
	public int registraCliente(ClienteDTO cliente) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "insert into cliente values(null,?,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cliente.getNomCliente());
			pstm.setString(2, cliente.getApeCliente());
			pstm.setInt(3, cliente.getDni());
			pstm.setString(4, cliente.getDireCliente());
			pstm.setString(5, cliente.getDistrito());
			pstm.setString(6, cliente.getFechaNaci());
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
	public int actualizarCliente(ClienteDTO cliente) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "update cliente set nom_Cliente=?, ape_Cliente=?, dni=?, dire_Cliente=?, distrito=?, fecha_Naci=? where id_Cliente=?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cliente.getNomCliente());
			pstm.setString(2, cliente.getApeCliente());
			pstm.setInt(3, cliente.getDni());
			pstm.setString(4, cliente.getDireCliente());
			pstm.setString(5, cliente.getDistrito());
			pstm.setString(6, cliente.getFechaNaci());
			pstm.setInt(7, cliente.getIdCliente());
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
	public ClienteDTO buscarCliente(int cod) {
		ClienteDTO cli = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "select * from cliente where id_Cliente=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			rs = pstm.executeQuery();
			if (rs.next()) {
				cli = new ClienteDTO();
				cli.setIdCliente(rs.getInt(1));
				cli.setNomCliente(rs.getString(2));
				cli.setApeCliente(rs.getString(3));
				cli.setDni(rs.getInt(4));
				cli.setDireCliente(rs.getString(5));
				cli.setDistrito(rs.getString(6));
				cli.setFechaNaci(rs.getString(7));		

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
		return cli;

	}

	@Override
	public int eliminarCliente(int cod) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "delete from cliente where id_Cliente=?";
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
	public List<ClienteDTO> clientesDistrito(String nombre) {
		ClienteDTO equip = null;
		List<ClienteDTO> data = new ArrayList<ClienteDTO>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MysqlDBConnection.getConexion();
			String sql = "select * from cliente where distrito=?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, nombre);
			rs = pstm.executeQuery();
			while (rs.next()) {
				equip = new ClienteDTO();
				equip.setIdCliente(rs.getInt(1));
				equip.setNomCliente(rs.getString(2));
				equip.setApeCliente(rs.getString(3));
				equip.setDni(rs.getInt(4));
				equip.setDireCliente(rs.getString(5));
				equip.setDistrito(rs.getString(6));
				equip.setFechaNaci(rs.getString(7));
				data.add(equip);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();
				if (cn != null)
					cn.close();
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return data;	
	}
}
