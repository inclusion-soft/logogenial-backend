package com.rc.logogenial.basicadminservice.model.dto.fuv;

public class IdentificacionBienDto {

	private String codigoIdentificacionBien;
	private Integer valorBien;
	private String claseIdentificacion;
	private String matriculaBien;

	public String getCodigoIdentificacionBien() {
		return codigoIdentificacionBien;
	}

	public void setCodigoIdentificacionBien(String codigoIdentificacionBien) {
		this.codigoIdentificacionBien = codigoIdentificacionBien;
	}

	public Integer getValorBien() {
		return valorBien;
	}

	public void setValorBien(Integer valorBien) {
		this.valorBien = valorBien;
	}

	public String getClaseIdentificacion() {
		return claseIdentificacion;
	}

	public void setClaseIdentificacion(String claseIdentificacion) {
		this.claseIdentificacion = claseIdentificacion;
	}

	public String getMatriculaBien() {
		return matriculaBien;
	}

	public void setMatriculaBien(String matriculaBien) {
		this.matriculaBien = matriculaBien;
	}

}
