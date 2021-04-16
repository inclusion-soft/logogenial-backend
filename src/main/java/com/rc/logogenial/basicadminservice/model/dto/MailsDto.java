package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;
import java.util.List;

public class MailsDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<MailDto> correo;

	public List<MailDto> getCorreo() {
		return correo;
	}

	public void setCorreo(List<MailDto> correo) {
		this.correo = correo;
	}
	
}
