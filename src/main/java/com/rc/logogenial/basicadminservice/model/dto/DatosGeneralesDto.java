package com.rc.logogenial.basicadminservice.model.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DatosGeneralesDto {
	
	private Long idFormulario;

	private Long id;

	private String nom1;

	private String nom2;

	private String apell1;

	private String apell2;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechExp;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechNac;

	private String descNacionalidad;

	private DatosGeograficosDto datosNacimiento;

	private DatosGeograficosDto datosExpedicion;

	private DatosGeograficosDto datosResidencia;
	
	private DatosGeograficosDto datosOficina;

	private UsuarioDto usuario;

	private InformacionFinancieraDto datosFinancieros = new InformacionFinancieraDto();
	
	private String correoENoti;
	
	private String ciudadDiligenciamiento;
	
	private BigDecimal valorInmueble;
	
	private Boolean guardadoForm;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public BigDecimal getValorInmueble() {
		return valorInmueble;
	}

	public void setValorInmueble(BigDecimal valorInmueble) {
		this.valorInmueble = valorInmueble;
	}

	public String getCiudadDiligenciamiento() {
		return ciudadDiligenciamiento;
	}

	public void setCiudadDiligenciamiento(String ciudadDiligenciamiento) {
		this.ciudadDiligenciamiento = ciudadDiligenciamiento;
	}

	public Long getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(Long idFormulario) {
		this.idFormulario = idFormulario;
	}

	public String getNom1() {
		return nom1;
	}

	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}

	public String getNom2() {
		return nom2;
	}

	public void setNom2(String nom2) {
		this.nom2 = nom2;
	}

	public String getApell1() {
		return apell1;
	}

	public void setApell1(String apell1) {
		this.apell1 = apell1;
	}

	public String getApell2() {
		return apell2;
	}

	public void setApell2(String apell2) {
		this.apell2 = apell2;
	}

	public String getFechExp() {
		return fechExp;
	}

	public void setFechExp(String fechExp) {
		this.fechExp = fechExp;
	}

	public String getFechNac() {
		return fechNac;
	}

	public void setFechNac(String fechNac) {
		this.fechNac = fechNac;
	}

	public String getDescNacionalidad() {
		return descNacionalidad;
	}

	public void setDescNacionalidad(String descNacionalidad) {
		this.descNacionalidad = descNacionalidad;
	}

	public DatosGeograficosDto getDatosResidencia() {
		return datosResidencia;
	}

	public void setDatosResidencia(DatosGeograficosDto datosResidencia) {
		this.datosResidencia = datosResidencia;
	}

	public static long getSerialversionuid() {
		return 1L;//serialVersionUID;
	}

	public UsuarioDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDto usuario) {
		this.usuario = usuario;
	}

	public DatosGeograficosDto getDatosNacimiento() {
		return datosNacimiento;
	}

	public void setDatosNacimiento(DatosGeograficosDto datosNacimiento) {
		this.datosNacimiento = datosNacimiento;
	}

	public DatosGeograficosDto getDatosExpedicion() {
		return datosExpedicion;
	}

	public void setDatosExpedicion(DatosGeograficosDto datosExpedicion) {
		this.datosExpedicion = datosExpedicion;
	}

	public InformacionFinancieraDto getDatosFinancieros() {
		return datosFinancieros;
	}

	public void setDatosFinancieros(InformacionFinancieraDto datosFinancieros) {
		this.datosFinancieros = datosFinancieros;
	}

	public String getCorreoENoti() {
		return correoENoti;
	}

	public void setCorreoENoti(String correoENoti) {
		this.correoENoti = correoENoti;
	}

	public Boolean getGuardadoForm() {
		return guardadoForm;
	}

	public void setGuardadoForm(Boolean guardadoForm) {
		this.guardadoForm = guardadoForm;
	}

	public DatosGeograficosDto getDatosOficina() {
		return datosOficina;
	}

	public void setDatosOficina(DatosGeograficosDto datosOficina) {
		this.datosOficina = datosOficina;
	}

}
