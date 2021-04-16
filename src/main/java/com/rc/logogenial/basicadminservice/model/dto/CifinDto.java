package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CifinDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty(value="archivo")
	@JsonIgnore
	private String archivo;
	
	@JsonProperty(value="datosTercero")
	private CifinTercero tercero;
	
	public CifinTercero getTercero() {
		return tercero;
	}

	public void setTercero(CifinTercero tercero) {
		this.tercero = tercero;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	
	
	
	
   
}
