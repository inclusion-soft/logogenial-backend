package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;
import java.util.List;

public class CelularesDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<CelularDto> celular;

	public List<CelularDto> getCelular() {
		return celular;
	}

	public void setCelular(List<CelularDto> celular) {
		this.celular = celular;
	}
	
}
