package com.rc.logogenial.basicadminservice.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DependenciaTerceroDto {
	
	private Long idFormulario;

	private Long id;

	private int tercero;

	private String nombreTercero;

	private String parenConTitular;

	private String nacionalidad;

	private String tipIdTercero;

	private String nomTipoDocIdSifi;

	private String numDocTercero;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechExpeTercero;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", locale = "es_CO", timezone = "GMT-5")
	private String fechNaciTercero;

	private String sexoTercero;

	private String estaCivilTercero;

	private DatosGeograficosDto datosResidencia = new DatosGeograficosDto();

	private String ocupaTercero;

	private String nombreOcupaTercero;

	private String otraOcupaTercero;

	private String ciuaTercero;

	private String nombEmpreTercero;

	private String cargoTercero;

	private DatosGeograficosDto datosOfc = new DatosGeograficosDto();

	private String actiEconoPrinciTercero;

	private String declaRentaTercero;

	private String activosTercero;

	private String pasivosTercero;

	private String patrimonioTercero;

	private String ingresoMenTercero;

	private String egresoMenTercero;

	private String otroIngresoTercero;

	private String detaOtroIngresoTercero;

	private String otroEgresoTercero;

	private String detaOtroEgresoTercero;

	private Boolean tieneDependencia;
	
	private String segundoNombreTercero;
	
	private String apellidoTercero;
	
	private String segundoApellidoTercero;

	private DatosGeograficosDto datosNacimiento = new DatosGeograficosDto();

	private DatosGeograficosDto datosExpedicion = new DatosGeograficosDto();

	private Boolean esPEP;

	public DependenciaTerceroDto() {}

//	public DependenciaTerceroDto(DependenciaTerceroEnti dependenciaEnti) {
//		if (Objects.nonNull(dependenciaEnti)) {
//			this.id = dependenciaEnti.getId();
//			this.idFormulario = dependenciaEnti.getIdFormulario();
//			this.tercero = dependenciaEnti.getTercero();
//			this.nombreTercero = dependenciaEnti.getNombreTercero();
//			this.parenConTitular = dependenciaEnti.getParenConTitular();
//			this.nacionalidad = dependenciaEnti.getNacionalidad();
//			this.tipIdTercero = dependenciaEnti.getTipoDocumento();
//			this.numDocTercero = dependenciaEnti.getNumeroDocumento();
//			if (!HelperUtil.isNullOrEmpty(dependenciaEnti.getFechaExp())) {
//				this.fechExpeTercero = HelperUtil.dateToString(dependenciaEnti.getFechaExp());
//			}
//			if (!HelperUtil.isNullOrEmpty(dependenciaEnti.getFechaNac())) {
//				this.fechNaciTercero = HelperUtil.dateToString(dependenciaEnti.getFechaNac());
//			}
//			this.sexoTercero = dependenciaEnti.getGenero();
//			this.estaCivilTercero = dependenciaEnti.getEstadoCivil();
//			this.ocupaTercero = dependenciaEnti.getOcupacion();
//			this.otraOcupaTercero = dependenciaEnti.getOtraOcupa();
//			this.ciuaTercero = dependenciaEnti.getCiiu();
//			this.nombEmpreTercero = dependenciaEnti.getNombreEmp();
//			this.cargoTercero = dependenciaEnti.getCargo();
//			this.actiEconoPrinciTercero = dependenciaEnti.getActividadEcono();
//			this.declaRentaTercero = dependenciaEnti.getDeclaraRenta();
//			this.activosTercero = dependenciaEnti.getValActivos();
//			this.pasivosTercero = dependenciaEnti.getValPasivos();
//			this.patrimonioTercero = dependenciaEnti.getValPatrimonio();
//			this.ingresoMenTercero = dependenciaEnti.getIngresosMen();
//			this.egresoMenTercero = dependenciaEnti.getEgresosMen();
//			this.otroIngresoTercero = dependenciaEnti.getOtrosIngresos();
//			this.detaOtroIngresoTercero = dependenciaEnti.getDetOtrosIngresos();
//			this.otroEgresoTercero = dependenciaEnti.getOtrosEgresos();
//			this.detaOtroEgresoTercero = dependenciaEnti.getDetOtrosEgresos();
//			this.segundoNombreTercero =dependenciaEnti.getSegundoNombreTercero();
//			this.apellidoTercero=dependenciaEnti.getApellidoTercero();
//			this.segundoApellidoTercero=dependenciaEnti.getSegundoApellidoTercero();
//			if (!HelperUtil.isNullOrEmpty(dependenciaEnti.getIdDatosOfc())) {
//				this.datosOfc = new DatosGeograficosDto(dependenciaEnti.getIdDatosOfc());
//			}
//			if (!HelperUtil.isNullOrEmpty(dependenciaEnti.getIdDatosResidencia())) {
//				this.datosResidencia = new DatosGeograficosDto(dependenciaEnti.getIdDatosResidencia());
//			}
//			this.tieneDependencia = dependenciaEnti.getTieneDependencia();
//			if (!HelperUtil.isNullOrEmpty(dependenciaEnti.getIdDatosNacimiento())) {
//				this.datosNacimiento = new DatosGeograficosDto(dependenciaEnti.getIdDatosNacimiento());
//			}
//			if (!HelperUtil.isNullOrEmpty(dependenciaEnti.getIdDatosExpedicion())) {
//				this.datosExpedicion = new DatosGeograficosDto(dependenciaEnti.getIdDatosExpedicion());
//			}
//
//			this.esPEP = dependenciaEnti.getEsPEP();
//		}
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

	public int getTercero() {
		return tercero;
	}

	public void setTercero(int tercero) {
		this.tercero = tercero;
	}

	public String getNombreTercero() {
		return nombreTercero;
	}

	public void setNombreTercero(String nombreTercero) {
		this.nombreTercero = nombreTercero;
	}

	public String getParenConTitular() {
		return parenConTitular;
	}

	public void setParenConTitular(String parenConTitular) {
		this.parenConTitular = parenConTitular;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipIdTercero() {
		return tipIdTercero;
	}

	public void setTipIdTercero(String tipIdTercero) {
		this.tipIdTercero = tipIdTercero;
	}

	public String getNumDocTercero() {
		return numDocTercero;
	}

	public void setNumDocTercero(String numDocTercero) {
		this.numDocTercero = numDocTercero;
	}

	public String getFechExpeTercero() {
		return fechExpeTercero;
	}

	public void setFechExpeTercero(String fechExpeTercero) {
		this.fechExpeTercero = fechExpeTercero;
	}

	public String getFechNaciTercero() {
		return fechNaciTercero;
	}

	public void setFechNaciTercero(String fechNaciTercero) {
		this.fechNaciTercero = fechNaciTercero;
	}

	public String getSexoTercero() {
		return sexoTercero;
	}

	public void setSexoTercero(String sexoTercero) {
		this.sexoTercero = sexoTercero;
	}

	public String getEstaCivilTercero() {
		return estaCivilTercero;
	}

	public void setEstaCivilTercero(String estaCivilTercero) {
		this.estaCivilTercero = estaCivilTercero;
	}

	public DatosGeograficosDto getDatosResidencia() {
		return datosResidencia;
	}

	public void setDatosResidencia(DatosGeograficosDto datosResidencia) {
		this.datosResidencia = datosResidencia;
	}

	public String getOcupaTercero() {
		return ocupaTercero;
	}

	public void setOcupaTercero(String ocupaTercero) {
		this.ocupaTercero = ocupaTercero;
	}

	public String getNombreOcupaTercero() {
		return nombreOcupaTercero;
	}

	public void setNombreOcupaTercero(String nombreOcupaTercero) {
		this.nombreOcupaTercero = nombreOcupaTercero;
	}

	public String getOtraOcupaTercero() {
		return otraOcupaTercero;
	}

	public void setOtraOcupaTercero(String otraOcupaTercero) {
		this.otraOcupaTercero = otraOcupaTercero;
	}

	public String getCiuaTercero() {
		return ciuaTercero;
	}

	public void setCiuaTercero(String ciuaTercero) {
		this.ciuaTercero = ciuaTercero;
	}

	public String getNombEmpreTercero() {
		return nombEmpreTercero;
	}

	public void setNombEmpreTercero(String nombEmpreTercero) {
		this.nombEmpreTercero = nombEmpreTercero;
	}

	public String getCargoTercero() {
		return cargoTercero;
	}

	public void setCargoTercero(String cargoTercero) {
		this.cargoTercero = cargoTercero;
	}

	public DatosGeograficosDto getDatosOfc() {
		return datosOfc;
	}

	public void setDatosOfc(DatosGeograficosDto datosOfc) {
		this.datosOfc = datosOfc;
	}

	public String getActiEconoPrinciTercero() {
		return actiEconoPrinciTercero;
	}

	public void setActiEconoPrinciTercero(String actiEconoPrinciTercero) {
		this.actiEconoPrinciTercero = actiEconoPrinciTercero;
	}

	public String getDeclaRentaTercero() {
		return declaRentaTercero;
	}

	public void setDeclaRentaTercero(String declaRentaTercero) {
		this.declaRentaTercero = declaRentaTercero;
	}

	public String getActivosTercero() {
		return activosTercero;
	}

	public void setActivosTercero(String activosTercero) {
		this.activosTercero = activosTercero;
	}

	public String getPasivosTercero() {
		return pasivosTercero;
	}

	public void setPasivosTercero(String pasivosTercero) {
		this.pasivosTercero = pasivosTercero;
	}

	public String getPatrimonioTercero() {
		return patrimonioTercero;
	}

	public void setPatrimonioTercero(String patrimonioTercero) {
		this.patrimonioTercero = patrimonioTercero;
	}

	public String getIngresoMenTercero() {
		return ingresoMenTercero;
	}

	public void setIngresoMenTercero(String ingresoMenTercero) {
		this.ingresoMenTercero = ingresoMenTercero;
	}

	public String getEgresoMenTercero() {
		return egresoMenTercero;
	}

	public void setEgresoMenTercero(String egresoMenTercero) {
		this.egresoMenTercero = egresoMenTercero;
	}

	public String getOtroIngresoTercero() {
		return otroIngresoTercero;
	}

	public void setOtroIngresoTercero(String otroIngresoTercero) {
		this.otroIngresoTercero = otroIngresoTercero;
	}

	public String getDetaOtroIngresoTercero() {
		return detaOtroIngresoTercero;
	}

	public void setDetaOtroIngresoTercero(String detaOtroIngresoTercero) {
		this.detaOtroIngresoTercero = detaOtroIngresoTercero;
	}

	public String getOtroEgresoTercero() {
		return otroEgresoTercero;
	}

	public void setOtroEgresoTercero(String otroEgresoTercero) {
		this.otroEgresoTercero = otroEgresoTercero;
	}

	public String getDetaOtroEgresoTercero() {
		return detaOtroEgresoTercero;
	}

	public void setDetaOtroEgresoTercero(String detaOtroEgresoTercero) {
		this.detaOtroEgresoTercero = detaOtroEgresoTercero;
	}

	public Boolean getTieneDependencia() {
		return tieneDependencia;
	}

	public void setTieneDependencia(Boolean tieneDependencia) {
		this.tieneDependencia = tieneDependencia;
	}

	public String getSegundoNombreTercero() {
		return segundoNombreTercero;
	}

	public void setSegundoNombreTercero(String segundoNombreTercero) {
		this.segundoNombreTercero = segundoNombreTercero;
	}

	public String getApellidoTercero() {
		return apellidoTercero;
	}

	public void setApellidoTercero(String apellidoTercero) {
		this.apellidoTercero = apellidoTercero;
	}

	public String getSegundoApellidoTercero() {
		return segundoApellidoTercero;
	}

	public void setSegundoApellidoTercero(String segundoApellidoTercero) {
		this.segundoApellidoTercero = segundoApellidoTercero;
	}

	public DatosGeograficosDto getDatosNacimiento() {
		return datosNacimiento;
	}

	public void setDatosNacimiento(DatosGeograficosDto datosNacimiento) {
		this.datosNacimiento = datosNacimiento;
	}

	public DatosGeograficosDto getDatosExpedicion() {
		return datosExpedicion;
	}

	public void setDatosExpedicion(DatosGeograficosDto datosExpedicion) {
		this.datosExpedicion = datosExpedicion;
	}

	public Boolean getEsPEP() {
		return esPEP;
	}

	public void setEsPEP(Boolean esPEP) {
		this.esPEP = esPEP;
	}

	public String getNomTipoDocIdSifi() {
		return nomTipoDocIdSifi;
	}

	public void setNomTipoDocIdSifi(String nomTipoDocIdSifi) {
		this.nomTipoDocIdSifi = nomTipoDocIdSifi;
	}


}
