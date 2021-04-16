package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;
import java.util.List;

public class TelefonosDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<TelefonoDto> telefono;

	public List<TelefonoDto> getTelefono() {
		return telefono;
	}

	public void setTelefono(List<TelefonoDto> telefono) {
		this.telefono = telefono;
	}
	
}
