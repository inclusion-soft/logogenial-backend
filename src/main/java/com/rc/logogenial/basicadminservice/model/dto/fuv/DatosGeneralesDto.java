package com.rc.logogenial.basicadminservice.model.dto.fuv;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DatosGeneralesDto {

	private String id;

	private String nombre1;

	private String nombre2;

	private String apellido1;

	private String apellido2;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechaExpedicion;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechaNacimiento;

	private String nacionalidad;

	private DatosGeograficosDto datosNacimiento;

	private DatosGeograficosDto datosExpedicion;

	private DatosGeograficosDto datosResidencia;
	
	private DatosGeograficosDto datosOficina;

	private UsuarioDto usuario;

	private InformacionFinancieraDto datosFinancieros = new InformacionFinancieraDto();

	
	private String ciudadDiligenciamiento;
	
	private BigDecimal valorInmueble;

	String correoElectronicoNotificacion;

	
//	private Boolean guardadoForm;

	public DatosGeneralesDto() {
	}

//	public DatosGeneralesDto(DatosGeneralesEnti datosGenerales) {
//		this.idFormulario = datosGenerales.getIdFormulario();
//
//		this.id = datosGenerales.getId();
//		this.nom1 = datosGenerales.getNombre1();
//		this.nom2 = datosGenerales.getNombre2();
//		this.apell1 = datosGenerales.getApellido1();
//		this.apell2 = datosGenerales.getApellido2();
//		
//		UsuarioEnti usuarioEnti = datosGenerales.getIdUsuario();
//		this.correoENoti = !HelperUtil.isNullOrEmpty(datosGenerales.getCorreoENoti())?
//				datosGenerales.getCorreoENoti() : usuarioEnti.getCorreo();
//
//		this.ciudadDiligenciamiento = datosGenerales.getCiudadDiligenciamiento();
//		this.valorInmueble=datosGenerales.getValorInmueble();
//		if (!HelperUtil.isNullOrEmpty(datosGenerales.getFecExp())) {
//			this.fechExp = HelperUtil.dateToString(datosGenerales.getFecExp());
//		}
//		if (!HelperUtil.isNullOrEmpty(datosGenerales.getFecNac())) {
//			this.fechNac = HelperUtil.dateToString(datosGenerales.getFecNac());
//		}
//		this.descNacionalidad = datosGenerales.getNacionalidad();
//		if (!HelperUtil.isNullOrEmpty(datosGenerales.getIdDatosNacimiento())) {
//			this.datosNacimiento = new DatosGeograficosDto(datosGenerales.getIdDatosNacimiento());
//		}
//		if (!HelperUtil.isNullOrEmpty(datosGenerales.getIdDatosExpedicion())) {
//			this.datosExpedicion = new DatosGeograficosDto(datosGenerales.getIdDatosExpedicion());
//		}
//		if (!HelperUtil.isNullOrEmpty(datosGenerales.getDatosResidencia())) {
//			this.datosResidencia = new DatosGeograficosDto(datosGenerales.getDatosResidencia());
//		}
//		if (!HelperUtil.isNullOrEmpty(datosGenerales.getDatosOfc())) {
//			this.setDatosOficina(new DatosGeograficosDto(datosGenerales.getDatosOfc()));
//		}
//		
//		if (!HelperUtil.isNullOrEmpty(usuarioEnti)) {
//			this.usuario = new UsuarioDto(usuarioEnti);
//		}
//		
//		this.guardadoForm = datosGenerales.getGuardadoForm();
//	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public BigDecimal getValorInmueble() {
//		return valorInmueble;
//	}
//
//	public void setValorInmueble(BigDecimal valorInmueble) {
//		this.valorInmueble = valorInmueble;
//	}
//
//	public String getCiudadDiligenciamiento() {
//		return ciudadDiligenciamiento;
//	}
//
//	public void setCiudadDiligenciamiento(String ciudadDiligenciamiento) {
//		this.ciudadDiligenciamiento = ciudadDiligenciamiento;
//	}
//
//	public Long getIdFormulario() {
//		return idFormulario;
//	}
//
//	public void setIdFormulario(Long idFormulario) {
//		this.idFormulario = idFormulario;
//	}
//
//	public String getNombre1() {
//		return nombre1;
//	}
//
//	public void setNombre1(String nombre1) {
//		this.nombre1 = nombre1;
//	}
//
//	public String getNombre2() {
//		return nombre2;
//	}
//
//	public void setNombre2(String nombre2) {
//		this.nombre2 = nombre2;
//	}
//
//	public String getApellido1() {
//		return apellido1;
//	}
//
//	public void setApellido1(String apellido1) {
//		this.apellido1 = apellido1;
//	}
//
//	public String getApellido2() {
//		return apellido2;
//	}
//
//	public void setApellido2(String apellido2) {
//		this.apellido2 = apellido2;
//	}
//
//	public String getFechaExpedicion() {
//		return fechaExpedicion;
//	}
//
//	public void setFechaExpedicion(String fechaExpedicion) {
//		this.fechaExpedicion = fechaExpedicion;
//	}
//
//	public String getFechaNacimiento() {
//		return fechaNacimiento;
//	}
//
//	public void setFechaNacimiento(String fechaNacimiento) {
//		this.fechaNacimiento = fechaNacimiento;
//	}
//
//	public String getNacionalidad() {
//		return nacionalidad;
//	}
//
//	public void setNacionalidad(String nacionalidad) {
//		this.nacionalidad = nacionalidad;
//	}
//
//	public DatosGeograficosDto getDatosResidencia() {
//		return datosResidencia;
//	}
//
//	public void setDatosResidencia(DatosGeograficosDto datosResidencia) {
//		this.datosResidencia = datosResidencia;
//	}
//
//	public static long getSerialversionuid() {
//		return 1L;//serialVersionUID;
//	}
//
//	public UsuarioDto getUsuario() {
//		return usuario;
//	}
//
//	public void setUsuario(UsuarioDto usuario) {
//		this.usuario = usuario;
//	}
//
//	public DatosGeograficosDto getDatosNacimiento() {
//		return datosNacimiento;
//	}
//
//	public void setDatosNacimiento(DatosGeograficosDto datosNacimiento) {
//		this.datosNacimiento = datosNacimiento;
//	}
//
//	public DatosGeograficosDto getDatosExpedicion() {
//		return datosExpedicion;
//	}
//
//	public void setDatosExpedicion(DatosGeograficosDto datosExpedicion) {
//		this.datosExpedicion = datosExpedicion;
//	}
//
//	public InformacionFinancieraDto getDatosFinancieros() {
//		return datosFinancieros;
//	}
//
//	public void setDatosFinancieros(InformacionFinancieraDto datosFinancieros) {
//		this.datosFinancieros = datosFinancieros;
//	}
//
//	public String getCorreoENoti() {
//		return correoENoti;
//	}
//
////	public void setCorreoENoti(String correoENoti) {
////		this.correoENoti = correoENoti;
////	}
////
////	public Boolean getGuardadoForm() {
////		return guardadoForm;
////	}
////
////	public void setGuardadoForm(Boolean guardadoForm) {
////		this.guardadoForm = guardadoForm;
////	}
//
//	public DatosGeograficosDto getDatosOficina() {
//		return datosOficina;
//	}
//
////	public void setDatosOficina(DatosGeograficosDto datosOficina) {
////		this.datosOficina = datosOficina;
////	}

}
