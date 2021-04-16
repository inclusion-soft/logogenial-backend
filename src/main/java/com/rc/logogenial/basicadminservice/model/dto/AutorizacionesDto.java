package com.rc.logogenial.basicadminservice.model.dto;

public class AutorizacionesDto {
	
	private Long id;

	private Long idFormulario;

	private Boolean trataBiometric;

	private Boolean comparInfoEntreCompa;

	private Boolean consultaBD;

	private Boolean trataDataNino;

	private Boolean usoPruebaEnProce;

	private Boolean trataDatos;

	public AutorizacionesDto() {
	}

//	public AutorizacionesDto(AutorizacionesEnti autorizacion) {
//		this.id = autorizacion.getId();
//		this.idFormulario = autorizacion.getIdFormulario();
//		this.trataBiometric = autorizacion.getTrataBiometric();
//		this.comparInfoEntreCompa = autorizacion.getComparInfoEntreCompa();
//		this.consultaBD = autorizacion.getConsultaBD();
//		this.trataDataNino = autorizacion.getTrataDataNino();
//		this.usoPruebaEnProce = autorizacion.getUsoPruebaEnProce();
//		this.trataDatos = autorizacion.getTrataDatos();
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getTrataBiometric() {
		return trataBiometric;
	}

	public void setTrataBiometric(Boolean trataBiometric) {
		this.trataBiometric = trataBiometric;
	}

	public Boolean getComparInfoEntreCompa() {
		return comparInfoEntreCompa;
	}

	public void setComparInfoEntreCompa(Boolean comparInfoEntreCompa) {
		this.comparInfoEntreCompa = comparInfoEntreCompa;
	}

	public Boolean getConsultaBD() {
		return consultaBD;
	}

	public void setConsultaBD(Boolean consultaBD) {
		this.consultaBD = consultaBD;
	}

	public Boolean getTrataDataNino() {
		return trataDataNino;
	}

	public void setTrataDataNino(Boolean trataDataNino) {
		this.trataDataNino = trataDataNino;
	}

	public Boolean getUsoPruebaEnProce() {
		return usoPruebaEnProce;
	}

	public void setUsoPruebaEnProce(Boolean usoPruebaEnProce) {
		this.usoPruebaEnProce = usoPruebaEnProce;
	}

	public Boolean getTrataDatos() {
		return trataDatos;
	}

	public void setTrataDatos(Boolean trataDatos) {
		this.trataDatos = trataDatos;
	}

	public Long getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(Long idFormulario) {
		this.idFormulario = idFormulario;
	}

}
