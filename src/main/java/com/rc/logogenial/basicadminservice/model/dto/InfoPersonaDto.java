package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoPersonaDto implements Serializable {
		
	private static final long serialVersionUID = 1L;

	@JsonProperty("tipoDocumento")
	private String tipoDocumento;
	
	@JsonProperty("numeroDocumento")
	private String numeroDocumento;
	
	@JsonProperty("nombres")
	private String nombres;
	
	@JsonProperty("apellidos")
	private String apellidos;
	
	@JsonProperty("fechaNacimiento")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "es_CO", timezone = "GMT-5")
	private Date fechaNacimiento;
	
	@JsonProperty("correo")
	private String correo;
	
	@JsonProperty("celular")
	private String celular;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
