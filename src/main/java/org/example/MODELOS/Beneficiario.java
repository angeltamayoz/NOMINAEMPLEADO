package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {
    //10 datos
    private Long id;
    private String nombre;
    private String apellido;
    private String relacion;
    private String telefono;
    private String direccion;
    private String email;
    private String numeroIdentificacion;
    private LocalDate fechaNacimiento;
    private String genero;
    private Double porcentajeBeneficio;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, String apellido, String relacion, String telefono, String direccion, String email, String numeroIdentificacion, LocalDate fechaNacimiento, String genero, Double porcentajeBeneficio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.relacion = relacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(Double porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", relacion='" + relacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero='" + genero + '\'' +
                ", porcentajeBeneficio=" + porcentajeBeneficio +
                '}';
    }
}
