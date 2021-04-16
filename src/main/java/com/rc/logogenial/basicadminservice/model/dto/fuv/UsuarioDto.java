package com.rc.logogenial.basicadminservice.model.dto.fuv;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UsuarioDto {

	private String numeroIdentificacion;
	private Integer tipoIdentificacion;
	private String tipoDocumentoIdentificacionSifi;
	private String nombreTipoDocumentoIdentificacionSifi;
	private String correoElectronicoNotificaciones;
	
	
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public Integer getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(Integer tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getTipoDocumentoIdentificacionSifi() {
		return tipoDocumentoIdentificacionSifi;
	}
	public void setTipoDocumentoIdentificacionSifi(String tipoDocumentoIdentificacionSifi) {
		this.tipoDocumentoIdentificacionSifi = tipoDocumentoIdentificacionSifi;
	}
	public String getNombreTipoDocumentoIdentificacionSifi() {
		return nombreTipoDocumentoIdentificacionSifi;
	}
	public void setNombreTipoDocumentoIdentificacionSifi(String nombreTipoDocumentoIdentificacionSifi) {
		this.nombreTipoDocumentoIdentificacionSifi = nombreTipoDocumentoIdentificacionSifi;
	}
	public String getCorreoElectronicoNotificaciones() {
		return correoElectronicoNotificaciones;
	}
	public void setCorreoElectronicoNotificaciones(String correoElectronicoNotificaciones) {
		this.correoElectronicoNotificaciones = correoElectronicoNotificaciones;
	}
	
	

}
