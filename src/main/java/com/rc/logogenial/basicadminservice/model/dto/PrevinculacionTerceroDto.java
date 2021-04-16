/* GP1292 inicio - jortiz.ext - 22012019 - Nuevo archivo */
package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;

public class PrevinculacionTerceroDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private int tipoDocumento;
	private String numeroIdenficacion;
	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;
	private String correo;
	private String telefono;
	private String idTpoForm;
	private String token;
	private boolean marcaPrecioEncargo;
	private Long idProyecto;
	private Long idFidecomiso;
	private Long numeroEncargo;
	private Long unidad;
	private String origenTipoRegistro;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroIdenficacion() {
		return numeroIdenficacion;
	}

	public void setNumeroIdenficacion(String numeroIdenficacion) {
		this.numeroIdenficacion = numeroIdenficacion;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Long getUnidad() {
		return unidad;
	}

	public void setUnidad(Long unidad) {
		this.unidad = unidad;
	}

	public String getIdTpoForm() {
		return idTpoForm;
	}

	public void setIdTpoForm(String idTpoForm) {
		this.idTpoForm = idTpoForm;
	}

	public Long getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Long idProyecto) {
		this.idProyecto = idProyecto;
	}

	public boolean isMarcaPrecioEncargo() {
		return marcaPrecioEncargo;
	}

	public void setMarcaPrecioEncargo(boolean marcaPrecioEncargo) {
		this.marcaPrecioEncargo = marcaPrecioEncargo;
	}

	public Long getIdFidecomiso() {
		return idFidecomiso;
	}

	public void setIdFidecomiso(Long idFidecomiso) {
		this.idFidecomiso = idFidecomiso;
	}

	public Long getNumeroEncargo() {
		return numeroEncargo;
	}

	public void setNumeroEncargo(Long numeroEncargo) {
		this.numeroEncargo = numeroEncargo;
	}

	public String getOrigenTipoRegistro() {
		return origenTipoRegistro;
	}

	public void setOrigenTipoRegistro(String origenTipoRegistro) {
		this.origenTipoRegistro = origenTipoRegistro;
	}
}

