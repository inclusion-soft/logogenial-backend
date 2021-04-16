package com.rc.logogenial.basicadminservice.model.dto;

public class InformacionFinancieraDto {
	
	private Long idFormulario;

	private Long id;
	
	private String actEconoPrinci;
	
	private String ciuaEmp;
	
	private String nombEmpre;
	
	private String ocupaDesc;
	
	private String valActivos;
	
	private String valPasivos;
	
	private String valIngresos;
	
	private String valEgresos;
	
	private String valPatrimonio;
	
	private String valOtrosIngresos;
	
	private String detallesOtrosIngresos;
	
	private String cargo;

	public InformacionFinancieraDto() {
	}

//	public InformacionFinancieraDto(InformacionFinancieraEnti informacionFinanciera) {
//		this.idFormulario = informacionFinanciera.getIdFormulario();
//		this.id = informacionFinanciera.getId();
//		this.ocupaDesc = informacionFinanciera.getOcupaDesc();
//		this.nombEmpre = informacionFinanciera.getNombEmpre();
//		this.actEconoPrinci = informacionFinanciera.getActEconoPrinci();
//		this.ciuaEmp = informacionFinanciera.getCiuaEmp();
//		this.valActivos = informacionFinanciera.getValActivos();
//		this.valPasivos = informacionFinanciera.getValPasivos();
//		this.valIngresos = informacionFinanciera.getValIngresos();
//		this.valEgresos = informacionFinanciera.getValEgresos();
//		this.valPatrimonio = informacionFinanciera.getValPatrimonio();
//		this.valOtrosIngresos = informacionFinanciera.getValOtroIngresoXMes();
//		this.detallesOtrosIngresos = informacionFinanciera.getDetaOtrosIngresos();
//		this.cargo = informacionFinanciera.getCargo();
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActEconoPrinci() {
		return actEconoPrinci;
	}

	public void setActEconoPrinci(String actEconoPrinci) {
		this.actEconoPrinci = actEconoPrinci;
	}

	public String getCiuaEmp() {
		return ciuaEmp;
	}

	public void setCiuaEmp(String ciuaEmp) {
		this.ciuaEmp = ciuaEmp;
	}

	public String getDetallesOtrosIngresos() {
		return detallesOtrosIngresos;
	}

	public void setDetallesOtrosIngresos(String detaOtrosIngresos) {
		this.detallesOtrosIngresos = detaOtrosIngresos;
	}

	public Long getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(Long idFormulario) {
		this.idFormulario = idFormulario;
	}

	public String getNombEmpre() {
		return nombEmpre;
	}

	public void setNombEmpre(String nombEmpre) {
		this.nombEmpre = nombEmpre;
	}

	public String getOcupaDesc() {
		return ocupaDesc;
	}

	public void setOcupaDesc(String ocupaDesc) {
		this.ocupaDesc = ocupaDesc;
	}

	public String getValActivos() {
		return valActivos;
	}

	public void setValActivos(String valActivos) {
		this.valActivos = valActivos;
	}

	public String getValEgresos() {
		return valEgresos;
	}

	public void setValEgresos(String valEgresos) {
		this.valEgresos = valEgresos;
	}

	public String getValIngresos() {
		return valIngresos;
	}

	public void setValIngresos(String valIngresos) {
		this.valIngresos = valIngresos;
	}

	public String getValOtrosIngresos() {
		return valOtrosIngresos;
	}

	public void setValOtroIngresos(String valOtroIngresoXMes) {
		this.valOtrosIngresos = valOtroIngresoXMes;
	}

	public String getValPasivos() {
		return valPasivos;
	}

	public void setValPasivos(String valPasivos) {
		this.valPasivos = valPasivos;
	}

	public String getValPatrimonio() {
		return valPatrimonio;
	}

	public void setValPatrimonio(String valPatrimonio) {
		this.valPatrimonio = valPatrimonio;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
