package com.rc.logogenial.basicadminservice.model.dto;

public class IdentificacionBienDto {
	
	private Long idFormulario;

	private Long id;

	private String bienClase;

	private String bienClaseDesc;

	private String bienMatri;

	private Long bienVal;

	public IdentificacionBienDto() {
	}

//	public IdentificacionBienDto(IdentificacionBienEnti identificacion) {
//		this.id = identificacion.getId();
//		this.bienClase = identificacion.getBienClase();
//		this.bienClaseDesc = identificacion.getBienClaseDesc();
//		this.bienMatri = identificacion.getBienMatri();
//		this.bienVal = identificacion.getBienVal();
//		this.idFormulario = identificacion.getIdFormulario();
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

	public String getBienClase() {
		return bienClase;
	}

	public void setBienClase(String bienClase) {
		this.bienClase = bienClase;
	}

	public String getBienClaseDesc() {
		return bienClaseDesc;
	}

	public void setBienClaseDesc(String bienClaseDesc) {
		this.bienClaseDesc = bienClaseDesc;
	}

	public String getBienMatri() {
		return bienMatri;
	}

	public void setBienMatri(String bienMatri) {
		this.bienMatri = bienMatri;
	}

	public Long getBienVal() {
		return bienVal;
	}

	public void setBienVal(Long bienVal) {
		this.bienVal = bienVal;
	}


}
