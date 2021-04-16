package com.rc.logogenial.basicadminservice.model.dto;

import java.math.BigInteger;

public class ConsultaUsuariosEncargoDto {

	private String nombre;
	private Short tipoId;
	private String numeroIdentificacion;
	private BigInteger estado;
	private String numeroEncargo;
	private String estadoUsuario;
	private String tipoIdDescripcion;
	private BigInteger idEncargo;
	private BigInteger idUsuario;
	private String validaanexos;
	private String espep;

	public ConsultaUsuariosEncargoDto() {
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}


	
	
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNumeroEncargo() {
		return numeroEncargo;
	}

	public void setNumeroEncargo(String numeroEncargo) {
		this.numeroEncargo = numeroEncargo;
	}

	public BigInteger getIdEncargo() {
		return idEncargo;
	}

	public void setIdEncargo(BigInteger idEncargo) {
		this.idEncargo = idEncargo;
	}

	public BigInteger getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(BigInteger idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Short getTipoId() {
		return tipoId;
	}

	public void setTipoId(Short tipoId) {
//		if (tipoId != null) {
//			tipoIdDescripcion = ETipoDocumentoTranslator.getByParametroPortal((int) tipoId).getParametroSIFI();
//		}
//		this.tipoId = tipoId;
	}

	public BigInteger getEstado() {
		return estado;
	}

	public void setEstado(BigInteger estado) {
		this.estado = estado;
	}

	public String getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(String estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public String getTipoIdDescripcion() {
		return tipoIdDescripcion;
	}

	public void setTipoIdDescripcion(String tipoIdDescripcion) {
		this.tipoIdDescripcion = tipoIdDescripcion;
	}

	public String getValidaanexos() {
		return validaanexos;
	}

	public void setValidaanexos(String validaanexos) {
		this.validaanexos = validaanexos;
	}

	public String getEspep() {
		return espep;
	}

	public void setEspep(String espep) {
		this.espep = espep;
	}

	
}
