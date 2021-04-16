package com.rc.logogenial.basicadminservice.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EntrevistaDto {
	
	private Long idFormulario;

	private Long id;
	
	private String nombUsuaRealizaEntre;

	private String lugarEntrevista;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechHoraEntrev;

	private String cuantiaPromMensual;

	private String frecuenciaOpera;

	private String comoConocioAlianza;

	private String infoAdiEntrevista;

	private String solicitaEsPep;

	private String productos;

	private String operaciones;

	private String codComercial;

	private String nomProyectoInmo;

	private String canalExterno;

	private String nombAgenQueLoRepre;

	private String nomComercial;

	private String nombreFuncVincPep;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechaComercial;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechaFuncVincPep;

	public EntrevistaDto() {
	}

//	public EntrevistaDto(EntrevistaEnti entrevista) {
//		this.id = entrevista.getId();
//		this.idFormulario = entrevista.getIdFormulario();
//		this.nombUsuaRealizaEntre = entrevista.getNombreFunc();
//		this.lugarEntrevista = entrevista.getLugarEntrev();
//		if (!HelperUtil.isNullOrEmpty(entrevista.getFechaEntrevista())) {
//			this.fechHoraEntrev = HelperUtil.dateToString(entrevista.getFechaEntrevista());
//		}
//		this.cuantiaPromMensual = entrevista.getCuantiaPromMensual();
//		this.frecuenciaOpera = entrevista.getFrecuenciaOpera();
//		this.comoConocioAlianza = entrevista.getComoConocioAlianza();
//		this.infoAdiEntrevista = entrevista.getOtroInfo();
//		this.solicitaEsPep = entrevista.getSoliPep();
//		this.productos = entrevista.getProductos();
//		this.operaciones = entrevista.getOperaciones();
//		this.codComercial = entrevista.getCodComercial();
//		this.nomProyectoInmo = entrevista.getNomProyectoInmo();
//		this.canalExterno = entrevista.getCanaExt();
//		this.nombAgenQueLoRepre = entrevista.getNomAgencia();
//		this.nomComercial = entrevista.getNomComercial();
//		if (!HelperUtil.isNullOrEmpty(entrevista.getFechaComercial())) {
//			this.fechaComercial = HelperUtil.dateToString(entrevista.getFechaComercial());
//		}
//		this.nombreFuncVincPep = entrevista.getNombreFuncVincPep();
//		if (!HelperUtil.isNullOrEmpty(entrevista.getFechaFuncVincPep())) {
//			this.fechaFuncVincPep = HelperUtil.dateToString(entrevista.getFechaFuncVincPep());
//		}
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(Long idFormulario) {
		this.idFormulario = idFormulario;
	}

	public String getNombUsuaRealizaEntre() {
		return nombUsuaRealizaEntre;
	}

	public void setNombUsuaRealizaEntre(String nombUsuaRealizaEntre) {
		this.nombUsuaRealizaEntre = nombUsuaRealizaEntre;
	}

	public String getLugarEntrevista() {
		return lugarEntrevista;
	}

	public void setLugarEntrevista(String lugarEntrevista) {
		this.lugarEntrevista = lugarEntrevista;
	}

	public String getFechHoraEntrev() {
		return fechHoraEntrev;
	}

	public void setFechHoraEntrev(String fechHoraEntrev) {
		this.fechHoraEntrev = fechHoraEntrev;
	}

	public String getCuantiaPromMensual() {
		return cuantiaPromMensual;
	}

	public void setCuantiaPromMensual(String cuantiaPromMensual) {
		this.cuantiaPromMensual = cuantiaPromMensual;
	}

	public String getFrecuenciaOpera() {
		return frecuenciaOpera;
	}

	public void setFrecuenciaOpera(String frecuenciaOpera) {
		this.frecuenciaOpera = frecuenciaOpera;
	}

	public String getComoConocioAlianza() {
		return comoConocioAlianza;
	}

	public void setComoConocioAlianza(String comoConocioAlianza) {
		this.comoConocioAlianza = comoConocioAlianza;
	}

	public String getInfoAdiEntrevista() {
		return infoAdiEntrevista;
	}

	public void setInfoAdiEntrevista(String infoAdiEntrevista) {
		this.infoAdiEntrevista = infoAdiEntrevista;
	}

	public String getSolicitaEsPep() {
		return solicitaEsPep;
	}

	public void setSolicitaEsPep(String solicitaEsPep) {
		this.solicitaEsPep = solicitaEsPep;
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public String getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}

	public String getCodComercial() {
		return codComercial;
	}

	public void setCodComercial(String codComercial) {
		this.codComercial = codComercial;
	}

	public String getNomProyectoInmo() {
		return nomProyectoInmo;
	}

	public void setNomProyectoInmo(String nomProyectoInmo) {
		this.nomProyectoInmo = nomProyectoInmo;
	}

	public String getCanalExterno() {
		return canalExterno;
	}

	public void setCanalExterno(String canalExterno) {
		this.canalExterno = canalExterno;
	}

	public String getNombAgenQueLoRepre() {
		return nombAgenQueLoRepre;
	}

	public void setNombAgenQueLoRepre(String nombAgenQueLoRepre) {
		this.nombAgenQueLoRepre = nombAgenQueLoRepre;
	}

	public String getNomComercial() {
		return nomComercial;
	}

	public void setNomComercial(String nomComercial) {
		this.nomComercial = nomComercial;
	}

	public String getFechaComercial() {
		return fechaComercial;
	}

	public void setFechaComercial(String fechaComercial) {
		this.fechaComercial = fechaComercial;
	}

	public String getNombreFuncVincPep() {
		return nombreFuncVincPep;
	}

	public void setNombreFuncVincPep(String nombreFuncVincPep) {
		this.nombreFuncVincPep = nombreFuncVincPep;
	}

	public String getFechaFuncVincPep() {
		return fechaFuncVincPep;
	}

	public void setFechaFuncVincPep(String fechaFuncVincPep) {
		this.fechaFuncVincPep = fechaFuncVincPep;
	}

}
