package com.rc.logogenial.basicadminservice.model.dto;

public class OrigenFondoDto {
	
private Long id;
	
	private Long idFormulario;

	private Long orFondos;
	
	private String orFondosDesc;

	private String nomComprador;

	private String origenAhorro;

	private String origenPension;

	private String otroOrigen;

	public OrigenFondoDto() {
	}

//	public OrigenFondoDto(OrigenFondoEnti origen) {
//		idFormulario = origen.getIdFormulario();
//		
//		id = origen.getId();
//		orFondos = origen.getOrFondos();
//		origenAhorro = origen.getOrigenAhorro();
//		origenPension = origen.getOrigenPension();
//		otroOrigen = origen.getOtroOrigen();
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

	public Long getOrFondos() {
		return orFondos;
	}

	public void setOrFondos(Long orFondos) {
		this.orFondos = orFondos;
	}

	public String getOrigenAhorro() {
		return origenAhorro;
	}

	public void setOrigenAhorro(String origenAhorro) {
		this.origenAhorro = origenAhorro;
	}

	public String getOrigenPension() {
		return origenPension;
	}

	public void setOrigenPension(String origenPension) {
		this.origenPension = origenPension;
	}

	public String getOtroOrigen() {
		return otroOrigen;
	}

	public void setOtroOrigen(String otroOrigen) {
		this.otroOrigen = otroOrigen;
	}

	public String getNomComprador() {
		return nomComprador;
	}

	public void setNomComprador(String nomComprador) {
		this.nomComprador = nomComprador;
	}

	public String getOrFondosDesc() {
		return orFondosDesc;
	}

	public void setOrFondosDesc(String orFondosDesc) {
		this.orFondosDesc = orFondosDesc;
	}

}
