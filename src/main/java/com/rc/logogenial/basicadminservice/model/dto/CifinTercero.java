package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CifinTercero implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String identificadorLinea;
	
//	@JsonProperty("TipoIdentificacion")
//	private String tipoIdentificacion;
	
	private String codigoTipoIndentificacion;
	
	private Long numeroIdentificacion;
	
	private String nombre1;
	
	private String nombre2;
	
	private String apellido1;
	
	private String apellido2;
	
	private String nombreTitular;
	
	private String nombreCiiu;
	
	private String lugarExpedicion;
	
	private String fechaExpedicion;
	
	private String estado;
	
	private String numeroInforme;
	
	private String estadoTitular;
	
	private String rangoEdad;
	
	private String codigoCiiu;
	
	private String codigoDepartamento;
	
	private String codigoMunicipio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "es_CO", timezone = "GMT-5")
	private Date fecha;
	
	private String hora;
	
	private String entidad;
	
	private String respuestaConsulta;
	
	@JsonProperty(value="generoTercero")
	private String generoTerceroUbicaPlusCifinTercero;
	
	@JsonProperty("direcciones")
	private DireccionesDto direcciones;
	
	@JsonProperty("contacto")
	private UbicaPlusCifinDto ubicaPlusCifinTercero;
	
	@JsonProperty("huella")
	private HuellaUbicaCifinDto huellaUbicaCifin;

	public String getIdentificadorLinea() {
		return identificadorLinea;
	}

	public void setIdentificadorLinea(String identificadorLinea) {
		this.identificadorLinea = identificadorLinea;
	}

//	public String getTipoIdentificacion() {
//		return tipoIdentificacion;
//	}
//
//	public void setTipoIdentificacion(String tipoIdentificacion) {
//		this.tipoIdentificacion = tipoIdentificacion;
//	}

	public String getCodigoTipoIndentificacion() {
		return codigoTipoIndentificacion;
	}

	public void setCodigoTipoIndentificacion(String codigoTipoIndentificacion) {
		this.codigoTipoIndentificacion = codigoTipoIndentificacion;
	}

	public Long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(Long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
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

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getNombreCiiu() {
		return nombreCiiu;
	}

	public void setNombreCiiu(String nombreCiiu) {
		this.nombreCiiu = nombreCiiu;
	}

	public String getLugarExpedicion() {
		return lugarExpedicion;
	}

	public void setLugarExpedicion(String lugarExpedicion) {
		this.lugarExpedicion = lugarExpedicion;
	}

	public String getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumeroInforme() {
		return numeroInforme;
	}

	public void setNumeroInforme(String numeroInforme) {
		this.numeroInforme = numeroInforme;
	}

	public String getEstadoTitular() {
		return estadoTitular;
	}

	public void setEstadoTitular(String estadoTitular) {
		this.estadoTitular = estadoTitular;
	}

	public String getRangoEdad() {
		return rangoEdad;
	}

	public void setRangoEdad(String rangoEdad) {
		this.rangoEdad = rangoEdad;
	}

	public String getCodigoCiiu() {
		return codigoCiiu;
	}

	public void setCodigoCiiu(String codigoCiiu) {
		this.codigoCiiu = codigoCiiu;
	}

	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getRespuestaConsulta() {
		return respuestaConsulta;
	}

	public void setRespuestaConsulta(String respuestaConsulta) {
		this.respuestaConsulta = respuestaConsulta;
	}

	public String getGeneroTerceroUbicaPlusCifinTercero() {
		return generoTerceroUbicaPlusCifinTercero;
	}

	public void setGeneroTerceroUbicaPlusCifinTercero(String generoTerceroUbicaPlusCifinTercero) {
		this.generoTerceroUbicaPlusCifinTercero = generoTerceroUbicaPlusCifinTercero;
	}

	public DireccionesDto getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(DireccionesDto direcciones) {
		this.direcciones = direcciones;
	}

	public UbicaPlusCifinDto getUbicaPlusCifinTercero() {
		return ubicaPlusCifinTercero;
	}

	public void setUbicaPlusCifinTercero(UbicaPlusCifinDto ubicaPlusCifinTercero) {
		this.ubicaPlusCifinTercero = ubicaPlusCifinTercero;
	}

	public HuellaUbicaCifinDto getHuellaUbicaCifin() {
		return huellaUbicaCifin;
	}

	public void setHuellaUbicaCifin(HuellaUbicaCifinDto huellaUbicaCifin) {
		this.huellaUbicaCifin = huellaUbicaCifin;
	}

}
