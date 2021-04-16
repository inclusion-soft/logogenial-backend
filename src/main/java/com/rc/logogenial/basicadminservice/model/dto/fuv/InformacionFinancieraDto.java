package com.rc.logogenial.basicadminservice.model.dto.fuv;

import lombok.Data;

@Data
public class InformacionFinancieraDto {
	
	private String actividadEconomicaPrincipal;
	private String ciudadEmpresa;
	private String nombreEmpresa;
	private String ocupacion;
	private Integer valorActivos;
	private Integer valorPasivos;
	private Integer valorIngresos;
	private Integer valorEgresos;
	private Integer valorPatrimonio;
	private Integer valorOtrosIngresos;
	private String detalleOtrosIngresos;
	private String cargo;
	
}
