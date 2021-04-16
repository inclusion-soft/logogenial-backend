package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;

public class UbicaPlusCifinDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private TelefonosDto telefonos;
	
	private CelularesDto celulares;
	
	private MailsDto correos;

	public TelefonosDto getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(TelefonosDto telefonos) {
		this.telefonos = telefonos;
	}

	public CelularesDto getCelulares() {
		return celulares;
	}

	public void setCelulares(CelularesDto celulares) {
		this.celulares = celulares;
	}

	public MailsDto getCorreos() {
		return correos;
	}

	public void setCorreos(MailsDto correos) {
		this.correos = correos;
	}

}
