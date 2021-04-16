package com.rc.logogenial.basicadminservice.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FatcaCrsDto {
	
	@JsonIgnore
	public static final String EE_UU_CODE = "7"; // Viene de SIFI

	private Long idFormulario;

	private Long id;

	private Boolean obligadoTributar = Boolean.FALSE;

	private Boolean obligadoTributarEnEEUU = Boolean.FALSE;

	private String numeroIdentificacionTributaria; // TIN

	private String codigoPais;

	private String nombrePais;

	private Integer orden = 0; // Orden autogestionado que indica el orden de la autocertificacion?

	public FatcaCrsDto() {
	}

//	public FatcaCrsDto(FatcaCrsEnti entiMapping) {
//		this.idFormulario = entiMapping.getIdFormulario();
//		this.id = entiMapping.getId();
//		this.codigoPais = entiMapping.getCodigoPais();
//		this.numeroIdentificacionTributaria = entiMapping.getNumeroIdentificacionTributaria();
//		this.orden = entiMapping.getOrden();
//		if(this.codigoPais==null)
//			return;
//		if (EE_UU_CODE.equals(this.codigoPais)) {
//			this.obligadoTributarEnEEUU = entiMapping.getObligadoTributar();
//		} else {
//			this.obligadoTributar = entiMapping.getObligadoTributar();
//		}
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

	public Boolean getObligadoTributar() {
		return obligadoTributar;
	}

	public void setObligadoTributar(Boolean obligadoTributar) {
		this.obligadoTributar = obligadoTributar;
	}

	public Boolean getObligadoTributarEnEEUU() {
		return obligadoTributarEnEEUU;
	}

	public void setObligadoTributarEnEEUU(Boolean obligadoTributarEnEEUU) {
		this.obligadoTributarEnEEUU = obligadoTributarEnEEUU;
	}

	public String getNumeroIdentificacionTributaria() {
		return numeroIdentificacionTributaria;
	}

	public void setNumeroIdentificacionTributaria(String numeroIdentificacionTributaria) {
		this.numeroIdentificacionTributaria = numeroIdentificacionTributaria;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

}
