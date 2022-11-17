package com.cibertec.beans;

public class ClienteDTO {

	private int idCliente;
	private String nomCliente;
	private String apeCliente;
	private int dni;
	private String direCliente;
	private String distrito;
	private String fechaNaci;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public String getApeCliente() {
		return apeCliente;
	}

	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireCliente() {
		return direCliente;
	}

	public void setDireCliente(String direCliente) {
		this.direCliente = direCliente;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getFechaNaci() {
		return fechaNaci;
	}

	public void setFechaNaci(String fechaNaci) {
		this.fechaNaci = fechaNaci;
	}

}
