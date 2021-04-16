package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HuellaUbicaCifinDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int contadorEntidad;
	private int contadorMercado;
	private int contadorTotal;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "es_CO", timezone = "GMT-5")
	private Date fechaUltimaConsultaEnt;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "es_CO", timezone = "GMT-5")
	private Date fechaUltimaConsultaMer;

	public int getContadorEntidad() {
		return contadorEntidad;
	}

	public void setContadorEntidad(int contadorEntidad) {
		this.contadorEntidad = contadorEntidad;
	}

	public int getContadorMercado() {
		return contadorMercado;
	}

	public void setContadorMercado(int contadorMercado) {
		this.contadorMercado = contadorMercado;
	}

	public int getContadorTotal() {
		return contadorTotal;
	}

	public void setContadorTotal(int contadorTotal) {
		this.contadorTotal = contadorTotal;
	}

	public Date getFechaUltimaConsultaEnt() {
		return fechaUltimaConsultaEnt;
	}

	public void setFechaUltimaConsultaEnt(Date fechaUltimaConsultaEnt) {
		this.fechaUltimaConsultaEnt = fechaUltimaConsultaEnt;
	}

	public Date getFechaUltimaConsultaMer() {
		return fechaUltimaConsultaMer;
	}

	public void setFechaUltimaConsultaMer(Date fechaUltimaConsultaMer) {
		this.fechaUltimaConsultaMer = fechaUltimaConsultaMer;
	}
	
	
	
}
