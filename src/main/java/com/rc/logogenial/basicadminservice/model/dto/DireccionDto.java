package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;

public class DireccionDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String dirPos;
	private String noReportes;
	private String productoActivo;
	private String tipoUbicacion;
	private String sectorEconomico;
	private String primerReporte;
	private String ultimoReporte;
	private String direccion;
	private String ciudad;
	private String pos;

	public String getDirPos() {
		return dirPos;
	}

	public void setDirPos(String dirPos) {
		this.dirPos = dirPos;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
