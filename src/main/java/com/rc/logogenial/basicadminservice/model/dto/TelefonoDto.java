package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TelefonoDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String telPos;
	private String noReportes;
	private String productoActivo;
	private String tipoUbicacion;
	private String sectorEconomico;
	private String primerReporte;
	private String ultimoReporte;
	private String prefijo;
	private String telefono;
	private String ciudad;
	private String pos;

	public String getTelPos() {
		return telPos;
	}

	public void setTelPos(String telPos) {
		this.telPos = telPos;
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

	public String getTipoUbicacion() {
		return tipoUbicacion;
	}

	public void setTipoUbicacion(String tipoUbicacion) {
		this.tipoUbicacion = tipoUbicacion;
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

	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
	
}
