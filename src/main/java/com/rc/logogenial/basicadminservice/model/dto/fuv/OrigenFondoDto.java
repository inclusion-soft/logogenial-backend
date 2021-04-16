package com.rc.logogenial.basicadminservice.model.dto.fuv;

public class OrigenFondoDto {

	private Long id;

	private Integer tipoOrigen;
	private String descripcionOrigen;
	private String nombreComprador;
	private String origenAhorro;
	private String origenPension;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTipoOrigen() {
		return tipoOrigen;
	}

	public void setTipoOrigen(Integer tipoOrigen) {
		this.tipoOrigen = tipoOrigen;
	}

	public String getDescripcionOrigen() {
		return descripcionOrigen;
	}

	public void setDescripcionOrigen(String descripcionOrigen) {
		this.descripcionOrigen = descripcionOrigen;
	}

	public String getNombreComprador() {
		return nombreComprador;
	}

	public void setNombreComprador(String nombreComprador) {
		this.nombreComprador = nombreComprador;
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

}
