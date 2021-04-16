package com.rc.logogenial.basicadminservice.model.dto;

public class EncabezadoFormularioDto {
	
private Long id;
	
	private Long idFormulario;
	
	private String otroProducto;
	
	private String producto;
	
	private String rol;
	
	private Boolean tieneOperacionesInternacionales;
	
	private Boolean dependeDeTerceros;

	public EncabezadoFormularioDto() {
	}
	
//	public EncabezadoFormularioDto(EncabezadoFormularioEnti encabezado) {
//		this.id = encabezado.getId();
//		this.idFormulario = encabezado.getIdFormulario();
//		this.otroProducto = encabezado.getOtroProducto();
//		this.producto = encabezado.getProducto();
//		this.rol = encabezado.getRol();
//	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdFormulario() {
		return this.idFormulario;
	}

	public void setIdFormulario(Long idFormulario) {
		this.idFormulario = idFormulario;
	}

	public String getOtroProducto() {
		return this.otroProducto;
	}

	public void setOtroProducto(String otroProducto) {
		this.otroProducto = otroProducto;
	}

	public String getProducto() {
		return this.producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Boolean getTieneOperacionesInternacionales() {
		return tieneOperacionesInternacionales;
	}

	public void setTieneOperacionesInternacionales(Boolean tieneOperacionesInternacionales) {
		this.tieneOperacionesInternacionales = tieneOperacionesInternacionales;
	}

	public Boolean getDependeDeTerceros() {
		return dependeDeTerceros;
	}

	public void setDependeDeTerceros(Boolean dependeDeTerceros) {
		this.dependeDeTerceros = dependeDeTerceros;
	}

}
