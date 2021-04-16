package com.rc.logogenial.basicadminservice.model.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BiometriaDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@JsonProperty("fotoCCDelante")
	private String fotoCCDelante;
	
	@JsonProperty("fotoCCAtras")
	private String fotoCCAtras;
	
	@JsonProperty("coincidenciaCodigoVsfotofrontal")
	private Long coincidenciaCodigoVsfotofrontal;
	
	@JsonProperty("coincidenciaCodigoVsfotoposterior")
	private Long coincidenciaCodigoVsfotoposterior;
	
	@JsonProperty("coincidenciafotofrontalVsreconocimientofacial")
	private Long coincidenciafotofrontalVsreconocimientofacial;
	
	@JsonProperty("pruebadevida")
	private Long pruebadevida;

	public String getFotoCCDelante() {
		return fotoCCDelante;
	}

	public void setFotoCCDelante(String fotoCCDelante) {
		this.fotoCCDelante = fotoCCDelante;
	}

	public String getFotoCCAtras() {
		return fotoCCAtras;
	}

	public void setFotoCCAtras(String fotoCCAtras) {
		this.fotoCCAtras = fotoCCAtras;
	}

	public Long getCoincidenciaCodigoVsfotofrontal() {
		return coincidenciaCodigoVsfotofrontal;
	}

	public void setCoincidenciaCodigoVsfotofrontal(Long coincidenciaCodigoVsfotofrontal) {
		this.coincidenciaCodigoVsfotofrontal = coincidenciaCodigoVsfotofrontal;
	}

	public Long getCoincidenciaCodigoVsfotoposterior() {
		return coincidenciaCodigoVsfotoposterior;
	}

	public void setCoincidenciaCodigoVsfotoposterior(Long coincidenciaCodigoVsfotoposterior) {
		this.coincidenciaCodigoVsfotoposterior = coincidenciaCodigoVsfotoposterior;
	}

	public Long getCoincidenciafotofrontalVsreconocimientofacial() {
		return coincidenciafotofrontalVsreconocimientofacial;
	}

	public void setCoincidenciafotofrontalVsreconocimientofacial(Long coincidenciafotofrontalVsreconocimientofacial) {
		this.coincidenciafotofrontalVsreconocimientofacial = coincidenciafotofrontalVsreconocimientofacial;
	}

	public Long getPruebadevida() {
		return pruebadevida;
	}

	public void setPruebadevida(Long pruebadevida) {
		this.pruebadevida = pruebadevida;
	}

}
