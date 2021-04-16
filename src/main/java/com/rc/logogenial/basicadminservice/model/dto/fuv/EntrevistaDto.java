package com.rc.logogenial.basicadminservice.model.dto.fuv;

import java.sql.Date;

public class EntrevistaDto {

	private String nombreUsuarioRealizaEntrevista;
	private String lugarEntrevista;
	private Date fechaHoraEntrevista;
	private Integer cuantiaPromedioMensual;
	private String frecuenciaOperativa;
	private String informacionAdicionalEntrevista;
	private boolean solicitanteEsPersonaExpuesta;
	private String productos;
	private String codigoComercial;
	private String operaciones;
	public String getNombreUsuarioRealizaEntrevista() {
		return nombreUsuarioRealizaEntrevista;
	}
	public void setNombreUsuarioRealizaEntrevista(String nombreUsuarioRealizaEntrevista) {
		this.nombreUsuarioRealizaEntrevista = nombreUsuarioRealizaEntrevista;
	}
	public String getLugarEntrevista() {
		return lugarEntrevista;
	}
	public void setLugarEntrevista(String lugarEntrevista) {
		this.lugarEntrevista = lugarEntrevista;
	}
	public Date getFechaHoraEntrevista() {
		return fechaHoraEntrevista;
	}
	public void setFechaHoraEntrevista(Date fechaHoraEntrevista) {
		this.fechaHoraEntrevista = fechaHoraEntrevista;
	}
	public Integer getCuantiaPromedioMensual() {
		return cuantiaPromedioMensual;
	}
	public void setCuantiaPromedioMensual(Integer cuantiaPromedioMensual) {
		this.cuantiaPromedioMensual = cuantiaPromedioMensual;
	}
	public String getFrecuenciaOperativa() {
		return frecuenciaOperativa;
	}
	public void setFrecuenciaOperativa(String frecuenciaOperativa) {
		this.frecuenciaOperativa = frecuenciaOperativa;
	}
	public String getInformacionAdicionalEntrevista() {
		return informacionAdicionalEntrevista;
	}
	public void setInformacionAdicionalEntrevista(String informacionAdicionalEntrevista) {
		this.informacionAdicionalEntrevista = informacionAdicionalEntrevista;
	}
	public boolean isSolicitanteEsPersonaExpuesta() {
		return solicitanteEsPersonaExpuesta;
	}
	public void setSolicitanteEsPersonaExpuesta(boolean solicitanteEsPersonaExpuesta) {
		this.solicitanteEsPersonaExpuesta = solicitanteEsPersonaExpuesta;
	}
	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
	}
	public String getCodigoComercial() {
		return codigoComercial;
	}
	public void setCodigoComercial(String codigoComercial) {
		this.codigoComercial = codigoComercial;
	}
	public String getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}
	
	
	

}
