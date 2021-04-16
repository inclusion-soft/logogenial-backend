package com.rc.logogenial.basicadminservice.model.dto.fuv;

public class AutoCertificacionDto {
	
	private String codigoPais;
	private boolean obligadoTributar;
	private boolean obligadoTributarEnEEUU;
	private String numeroIdentificacionTributaria;
	private String nombrePais;
	private String ordenAutocertificacion;
	public String getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}
	public boolean isObligadoTributar() {
		return obligadoTributar;
	}
	public void setObligadoTributar(boolean obligadoTributar) {
		this.obligadoTributar = obligadoTributar;
	}
	public boolean isObligadoTributarEnEEUU() {
		return obligadoTributarEnEEUU;
	}
	public void setObligadoTributarEnEEUU(boolean obligadoTributarEnEEUU) {
		this.obligadoTributarEnEEUU = obligadoTributarEnEEUU;
	}
	public String getNumeroIdentificacionTributaria() {
		return numeroIdentificacionTributaria;
	}
	public void setNumeroIdentificacionTributaria(String numeroIdentificacionTributaria) {
		this.numeroIdentificacionTributaria = numeroIdentificacionTributaria;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	public String getOrdenAutocertificacion() {
		return ordenAutocertificacion;
	}
	public void setOrdenAutocertificacion(String ordenAutocertificacion) {
		this.ordenAutocertificacion = ordenAutocertificacion;
	}
	
	

}
