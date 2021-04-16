package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DireccionesDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("direccion")
	private List<DireccionDto> direccionList;

	public List<DireccionDto> getDireccionList() {
		return direccionList;
	}

	public void setDireccionList(List<DireccionDto> direccionList) {
		this.direccionList = direccionList;
	}

}
