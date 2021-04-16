package com.rc.logogenial.basicadminservice.model.dto.RegistroTercero;

//public class CreacionTerceroDto {
//}


import java.util.Date;

public class CreacionTerceroDto {


    private String numeroDocumento;
    private String tipoDocumento;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String correo;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String idTIpoForm;
    private String token;
    private boolean marcaPrecioEncargo;
    private String codProyecto;
    private String numeroEncargo;
    private Integer unidad;
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNombre1() {
        return nombre1;
    }
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }
    public String getNombre2() {
        return nombre2;
    }
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getIdTIpoForm() {
        return idTIpoForm;
    }
    public void setIdTIpoForm(String idTIpoForm) {
        this.idTIpoForm = idTIpoForm;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public boolean isMarcaPrecioEncargo() {
        return marcaPrecioEncargo;
    }
    public void setMarcaPrecioEncargo(boolean marcaPrecioEncargo) {
        this.marcaPrecioEncargo = marcaPrecioEncargo;
    }
    public String getCodProyecto() {
        return codProyecto;
    }
    public void setCodProyecto(String codProyecto) {
        this.codProyecto = codProyecto;
    }
    public String getNumeroEncargo() {
        return numeroEncargo;
    }
    public void setNumeroEncargo(String numeroEncargo) {
        this.numeroEncargo = numeroEncargo;
    }
    public Integer getUnidad() {
        return unidad;
    }
    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }



}

