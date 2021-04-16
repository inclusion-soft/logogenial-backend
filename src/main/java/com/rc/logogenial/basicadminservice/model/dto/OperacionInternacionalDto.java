package com.rc.logogenial.basicadminservice.model.dto;

public class OperacionInternacionalDto {
	
	private Long idFormulario;

	private Long id;

	private Long operDescri;

	private DatosGeograficosDto datosGeo;

	private String realiOperInter;

	private String nombEntiFinanc;

	private String numCuenta;

	private String moneda;
	
	private String nombreMoneda;

	private String tipTransacDescri;
	
	private String nombreTipoTransaccion;

	private String valPromedMen;

	private String inverPortadeMe; // PJ

	public OperacionInternacionalDto() {
	}

//	public OperacionInternacionalDto(OperacionInternacionalEnti operacion) {
//		this.id = operacion.getId();
//		if (!HelperUtil.isNullOrEmpty(operacion.getIdDatosGeo())) {
//			this.datosGeo = new DatosGeograficosDto(operacion.getIdDatosGeo());
//		}
//		this.realiOperInter = (!HelperUtil.isNullOrEmpty(this.id) || !HelperUtil.isNullOrEmpty(operacion.getRealiOperInter())) ? ConstantesBoolean.SI : ConstantesBoolean.NO;
//		this.nombEntiFinanc = operacion.getNombEntiFinanc();
//		this.idFormulario = operacion.getIdFormulario();
//		this.numCuenta = operacion.getNumCuenta();
//		this.moneda = operacion.getMoneda();
//		this.operDescri = operacion.getOperDescri();
//		this.tipTransacDescri = operacion.getTipTransacDescri();
//		this.valPromedMen = operacion.getValPromedMen();
//		this.inverPortadeMe = operacion.getInverPortadeMe();
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRealiOperInter() {
		return realiOperInter;
	}

	public void setRealiOperInter(String realiOperInter) {
		this.realiOperInter = realiOperInter;
	}

	public String getNombEntiFinanc() {
		return nombEntiFinanc;
	}

	public void setNombEntiFinanc(String nombEntiFinanc) {
		this.nombEntiFinanc = nombEntiFinanc;
	}

	public Long getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(Long idFormulario) {
		this.idFormulario = idFormulario;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getNombreMoneda() {
		return nombreMoneda;
	}

	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}

	public Long getOperDescri() {
		return operDescri;
	}

	public void setOperDescri(Long operDescri) {
		this.operDescri = operDescri;
	}

	public String getTipTransacDescri() {
		return tipTransacDescri;
	}

	public void setTipTransacDescri(String tipTransacDescri) {
		this.tipTransacDescri = tipTransacDescri;
	}

	public String getNombreTipoTransaccion() {
		return nombreTipoTransaccion;
	}

	public void setNombreTipoTransaccion(String nombreTipoTransaccion) {
		this.nombreTipoTransaccion = nombreTipoTransaccion;
	}

	public String getValPromedMen() {
		return valPromedMen;
	}

	public void setValPromedMen(String valPromedMen) {
		this.valPromedMen = valPromedMen;
	}

	public String getInverPortadeMe() {
		return inverPortadeMe;
	}

	public void setInverPortadeMe(String inverPortadeMe) {
		this.inverPortadeMe = inverPortadeMe;
	}

	public DatosGeograficosDto getDatosGeo() {
		return datosGeo;
	}

	public void setDatosGeo(DatosGeograficosDto idDatosGeo) {
		this.datosGeo = idDatosGeo;
	}

}
