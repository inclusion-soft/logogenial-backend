package com.rc.logogenial.basicadminservice.model.dto;

public class DatosGeograficosDto {
	
	private Long id;

	private String codCiudMun;

	private String nomCiudMun;

	private String codDepart;

	private String nomDepart;

	private String codPais;

	private String nomPais;

	private String direccion;
	
	private boolean diresRural ;

	private Long idTipo = 0L;

	private String telefono;

	public DatosGeograficosDto() {
	}

//	public DatosGeograficosDto(DatosGeograficosEnti datos) {
//		this.id = datos.getId();
//		this.codCiudMun = datos.getCodCiudMun();
//		this.codDepart = datos.getCodDepart();
//		this.codPais = datos.getCodPais();
//		this.direccion = datos.getDireccion();
//		this.idTipo = datos.getIdTipo();
//		this.telefono = datos.getTelefono();
//		this.nomPais = datos.getNomPais();
//		this.nomDepart = datos.getNomDepart();
//		this.nomCiudMun = datos.getNomCiudMun();
//		this.diresRural=datos.isDiresRural();
//	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodCiudMun() {
		return this.codCiudMun;
	}

	public void setCodCiudMun(String codCiudMun) {
		this.codCiudMun = codCiudMun;
	}

	public String getCodDepart() {
		return this.codDepart;
	}

	public void setCodDepart(String codDepart) {
		this.codDepart = codDepart;
	}

	public String getCodPais() {
		return this.codPais;
	}

	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	public String getDireccion() {
//		this.direccion=!HelperUtil.isNullOrEmpty(this.direccion) && this.direccion.length()>50 ?this.direccion.substring(0, 49) : this.direccion ;
//		return this.direccion;
		return "";
	}

	public void setDireccion(String direccion) {
		//this.direccion = !HelperUtil.isNullOrEmpty(direccion) && direccion.length()>50 ?direccion.substring(0, 49) : direccion ;
	}

	public Long getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNomCiudMun() {
		return nomCiudMun;
	}

	public void setNomCiudMun(String nomCiudMun) {
		this.nomCiudMun = nomCiudMun;
	}

	public String getNomDepart() {
		return nomDepart;
	}

	public void setNomDepart(String nomDepart) {
		this.nomDepart = nomDepart;
	}

	public String getNomPais() {
		return nomPais;
	}

	public void setNomPais(String nomPais) {
		this.nomPais = nomPais;
	}

	public boolean isDiresRural() {
		return diresRural;
	}

	public void setDiresRural(boolean diresRural) {
		this.diresRural = diresRural;
	}


}
