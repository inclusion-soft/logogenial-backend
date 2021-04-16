package com.rc.logogenial.basicadminservice.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PersonaPeDto {
	
	private Long idFormulario;

	private Long id;

	private String ocupaCargoPublic;

	private String tieneSocieConPerPublic;

	private String esFamiliConPerPublic;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechDesvinCargPublic;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechVinCargPublic;

	private String publicDesc;

	private String nombFuncVinculo;

	private String nombConyugue;

	private String nombFamiliar;

	private String nombOrganiza;

	private String parentesco;

	private String gozaReconoPublic;

	private String manejaRecPublic;

	private String esRepreLegalInternacio;

	private String vincuConFuncAlianza;

	private String emailNotifiRepreLegal; // PJ
	
	private String cargo;

	public PersonaPeDto() {
	}

//	public PersonaPeDto(PersonaPeEnti persona) {
//		this.idFormulario = persona.getIdFormulario();
//		
//		this.id = persona.getId();
//		this.ocupaCargoPublic = persona.getOcupaCargoPublic();
//		this.tieneSocieConPerPublic = persona.getTieneSocieConPerPublic();
//		this.esFamiliConPerPublic = persona.getEsFamiliConPerPublic();
//		if (!HelperUtil.isNullOrEmpty(persona.getFechDesvinCargPublic())) {
//			this.fechDesvinCargPublic = HelperUtil.dateToString(persona.getFechDesvinCargPublic());
//		}
//		if (!HelperUtil.isNullOrEmpty(persona.getFechVinCargPublic())) {
//			this.fechVinCargPublic = HelperUtil.dateToString(persona.getFechVinCargPublic());
//		}
//		this.cargo=persona.getCargo();
//		this.publicDesc = persona.getPublicDesc();
//		this.nombFuncVinculo = persona.getNombFuncVinculo();
//		this.nombConyugue = persona.getNombConyugue();
//		this.nombFamiliar = persona.getNombFamiliar();
//		this.nombOrganiza = persona.getNombOrganiza();
//		this.parentesco = persona.getParentesco();
//		this.gozaReconoPublic = persona.getGozaReconoPublic();
//		this.manejaRecPublic = persona.getManejaRecPublic();
//		this.esRepreLegalInternacio = persona.getEsRepreLegalInternacio();
//		this.vincuConFuncAlianza = persona.getVincuConFuncAlianza();
//		this.emailNotifiRepreLegal = persona.getEmailNotifiRepreLegal();
//
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(Long idFormulario) {
		this.idFormulario = idFormulario;
	}

	public String getOcupaCargoPublic() {
		return ocupaCargoPublic;
	}

	public void setOcupaCargoPublic(String ocupaCargoPublic) {
		this.ocupaCargoPublic = ocupaCargoPublic;
	}

	public String getTieneSocieConPerPublic() {
		return tieneSocieConPerPublic;
	}

	public void setTieneSocieConPerPublic(String tieneSocieConPerPublic) {
		this.tieneSocieConPerPublic = tieneSocieConPerPublic;
	}

	public String getEsFamiliConPerPublic() {
		return esFamiliConPerPublic;
	}

	public void setEsFamiliConPerPublic(String esFamiliConPerPublic) {
		this.esFamiliConPerPublic = esFamiliConPerPublic;
	}

	public String getFechDesvinCargPublic() {
		return fechDesvinCargPublic;
	}

	public void setFechDesvinCargPublic(String fechDesvinCargPublic) {
		this.fechDesvinCargPublic = fechDesvinCargPublic;
	}

	public String getFechVinCargPublic() {
		return fechVinCargPublic;
	}

	public void setFechVinCargPublic(String fechVinCargPublic) {
		this.fechVinCargPublic = fechVinCargPublic;
	}

	public String getPublicDesc() {
		return publicDesc;
	}

	public void setPublicDesc(String publicDesc) {
		this.publicDesc = publicDesc;
	}

	public String getNombFuncVinculo() {
		return nombFuncVinculo;
	}

	public void setNombFuncVinculo(String nombFuncVinculo) {
		this.nombFuncVinculo = nombFuncVinculo;
	}

	public String getNombConyugue() {
		return nombConyugue;
	}

	public void setNombConyugue(String nombConyugue) {
		this.nombConyugue = nombConyugue;
	}

	public String getNombFamiliar() {
		return nombFamiliar;
	}

	public void setNombFamiliar(String nombFamiliar) {
		this.nombFamiliar = nombFamiliar;
	}

	public String getNombOrganiza() {
		return nombOrganiza;
	}

	public void setNombOrganiza(String nombOrganiza) {
		this.nombOrganiza = nombOrganiza;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getGozaReconoPublic() {
		return gozaReconoPublic;
	}

	public void setGozaReconoPublic(String gozaReconoPublic) {
		this.gozaReconoPublic = gozaReconoPublic;
	}

	public String getManejaRecPublic() {
		return manejaRecPublic;
	}

	public void setManejaRecPublic(String manejaRecPublic) {
		this.manejaRecPublic = manejaRecPublic;
	}

	public String getEsRepreLegalInternacio() {
		return esRepreLegalInternacio;
	}

	public void setEsRepreLegalInternacio(String esRepreLegalInternacio) {
		this.esRepreLegalInternacio = esRepreLegalInternacio;
	}

	public String getVincuConFuncAlianza() {
		return vincuConFuncAlianza;
	}

	public void setVincuConFuncAlianza(String vincuConFuncAlianza) {
		this.vincuConFuncAlianza = vincuConFuncAlianza;
	}

	public String getEmailNotifiRepreLegal() {
		return emailNotifiRepreLegal;
	}

	public void setEmailNotifiRepreLegal(String emailNotifiRepreLegal) {
		this.emailNotifiRepreLegal = emailNotifiRepreLegal;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
