package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CelularDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String celPos;
	private String noReportes;
	private String productoActivo;
	private String sectorEconomico;
	private String primerReporte;
	private String ultimoReporte;
	private Long celular;
	private String pos;

	public String getCelPos() {
		return celPos;
	}

	public void setCelPos(String celPos) {
		this.celPos = celPos;
	}

	public String getNoReportes() {
		return noReportes;
	}

	public void setNoReportes(String noReportes) {
		this.noReportes = noReportes;
	}

	public String getProductoActivo() {
		return productoActivo;
	}

	public void setProductoActivo(String productoActivo) {
		this.productoActivo = productoActivo;
	}

	public String getSectorEconomico() {
		return sectorEconomico;
	}

	public void setSectorEconomico(String sectorEconomico) {
		this.sectorEconomico = sectorEconomico;
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

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
	
	
}
