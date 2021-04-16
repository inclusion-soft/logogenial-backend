package com.rc.logogenial.basicadminservice.model.dto.fuv;

public class OperacionInternacionalDto {
	
	private boolean realizarOperacion;
	private String nombreEntidadFinanciera;
	private String nombreTipo;
	private String numeroCuenta;
	private String moneda;
	private String tipoOperacionTransaccion;
	private String valorPromedioMensual;
	private DatosGeograficosDto datosGeograficos;
	
	public boolean isRealizarOperacion() {
		return realizarOperacion;
	}
	public void setRealizarOperacion(boolean realizarOperacion) {
		this.realizarOperacion = realizarOperacion;
	}
	public String getNombreEntidadFinanciera() {
		return nombreEntidadFinanciera;
	}
	public void setNombreEntidadFinanciera(String nombreEntidadFinanciera) {
		this.nombreEntidadFinanciera = nombreEntidadFinanciera;
	}
	public String getNombreTipo() {
		return nombreTipo;
	}
	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getTipoOperacionTransaccion() {
		return tipoOperacionTransaccion;
	}
	public void setTipoOperacionTransaccion(String tipoOperacionTransaccion) {
		this.tipoOperacionTransaccion = tipoOperacionTransaccion;
	}
	public String getValorPromedioMensual() {
		return valorPromedioMensual;
	}
	public void setValorPromedioMensual(String valorPromedioMensual) {
		this.valorPromedioMensual = valorPromedioMensual;
	}
	public DatosGeograficosDto getDatosGeograficos() {
		return datosGeograficos;
	}
	public void setDatosGeograficos(DatosGeograficosDto datosGeograficos) {
		this.datosGeograficos = datosGeograficos;
	}
	
	
	
}
