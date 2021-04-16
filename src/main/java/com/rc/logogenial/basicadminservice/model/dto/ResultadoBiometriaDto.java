package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoBiometriaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("codigoResultado")
	private String codigoResultado;
	
	@JsonProperty("mensaje")
	private String mensaje;
	
	@JsonProperty("datosPersonales")
	private InfoPersonaDto infoPersona;
	
	@JsonProperty("resultado")
	private BiometriaDto biometria;
	
	@JsonProperty("detalle")
	private CifinDto cifin;
	
	private String unidad;
	private String idProyecto;
	private String idFidecomiso;
	private String numeroEncargo;
	private String idTpoForm;
	private String token;
	private String parametroPortal;
	private boolean marcaPrecioEncargo;
	private boolean aplicaBiometria;

	public boolean getAplicaBiometria() {
		return aplicaBiometria;
	}

	public void setAplicaBiometria(boolean aplicaBiometria) {
		this.aplicaBiometria = aplicaBiometria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public String getCodigoResultado() {
		return codigoResultado;
	}

	public void setCodigoResultado(String codigoResultado) {
		this.codigoResultado = codigoResultado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public InfoPersonaDto getInfoPersona() {
		return infoPersona;
	}

	public void setInfoPersona(InfoPersonaDto infoPersona) {
		this.infoPersona = infoPersona;
	}

	public CifinDto getCifin() {
		return cifin;
	}

	public void setCifin(CifinDto cifin) {
		this.cifin = cifin;
	}

	public BiometriaDto getBiometria() {
		return biometria;
	}

	public void setBiometria(BiometriaDto biometria) {
		this.biometria = biometria;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getIdFidecomiso() {
		return idFidecomiso;
	}

	public void setIdFidecomiso(String idFidecomiso) {
		this.idFidecomiso = idFidecomiso;
	}

	public String getNumeroEncargo() {
		return numeroEncargo;
	}

	public void setNumeroEncargo(String numeroEncargo) {
		this.numeroEncargo = numeroEncargo;
	}

	public String getIdTpoForm() {
		return idTpoForm;
	}

	public void setIdTpoForm(String idTpoForm) {
		this.idTpoForm = idTpoForm;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getParametroPortal() {
		return parametroPortal;
	}

	public void setParametroPortal(String parametroPortal) {
		this.parametroPortal = parametroPortal;
	}

	public boolean isMarcaPrecioEncargo() {
		return marcaPrecioEncargo;
	}

	public void setMarcaPrecioEncargo(boolean marcaPrecioEncargo) {
		this.marcaPrecioEncargo = marcaPrecioEncargo;
	}
	
	
	
}
