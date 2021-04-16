package com.rc.logogenial.basicadminservice.model.dto;

public class PerfilRiesgoDto {
	
	private Long idFormulario;

	private Long id;

	private String strCodigo;

	private String strDescripcion;

	public PerfilRiesgoDto() {

	}
	
	public PerfilRiesgoDto(Long idFormulario) {
		this.idFormulario = idFormulario;
		this.strCodigo = null;
		this.strDescripcion = "CON";
	}
	

//	public PerfilRiesgoDto(PerfilRiesgoEnti perfil) {
//		this.id = perfil.getId();
//		this.idFormulario = perfil.getIdFormulario();
//		this.strCodigo = perfil.getPerfilRiesgo();
//		this.strDescripcion = perfil.getPerfilDesc();
//	}

	public Long getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(Long idFormulario) {
		this.idFormulario = idFormulario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStrCodigo() {
		return strCodigo;
	}

	public void setStrCodigo(String perfilRiesgo) {
		this.strCodigo = perfilRiesgo;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String perfilDesc) {
		this.strDescripcion = perfilDesc;
	}

}
