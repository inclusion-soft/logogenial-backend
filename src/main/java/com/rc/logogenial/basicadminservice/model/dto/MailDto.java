package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MailDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String noReportes;
	private String primerReporte;
	private String ultimoReporte;
	private String correo;
	private String pos;

	public String getNoReportes() {
		return noReportes;
	}

	public void setNoReportes(String noReportes) {
		this.noReportes = noReportes;
	}

	public String getPrimerReporte() {
		return primerReporte;
	}

	public void setPrimerReporte(String primerReporte) {
		this.primerReporte = primerReporte;
	}

	public String getUltimoReporte() {
		return ultimoReporte;
	}

	public void setUltimoReporte(String ultimoReporte) {
		this.ultimoReporte = ultimoReporte;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
	
	
}
