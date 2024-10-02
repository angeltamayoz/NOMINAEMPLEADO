package org.example.MODELOS;

import java.time.LocalDate;

public class Empleado {
    //15 datos
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private String numeroIdentificacion;
    private LocalDate fechaNacimiento;
    private String estadoCivil;
    private String genero;
    private String puesto;
    private Double salarioBase;
    private LocalDate fechaContratacion;
    private Boolean esTiempoCompleto;
    private Integer horasTrabajadas;
    private Double bonificaciones;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, String direccion, String telefono, String email, String numeroIdentificacion, LocalDate fechaNacimiento, String estadoCivil, String genero, String puesto, Double salarioBase, LocalDate fechaContratacion, Boolean esTiempoCompleto, Integer horasTrabajadas, Double bonificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        this.fechaContratacion = fechaContratacion;
        this.esTiempoCompleto = esTiempoCompleto;
        this.horasTrabajadas = horasTrabajadas;
        this.bonificaciones = bonificaciones;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Boolean getEsTiempoCompleto() {
        return esTiempoCompleto;
    }

    public void setEsTiempoCompleto(Boolean esTiempoCompleto) {
        this.esTiempoCompleto = esTiempoCompleto;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(Double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", genero='" + genero + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salarioBase=" + salarioBase +
                ", fechaContratacion=" + fechaContratacion +
                ", esTiempoCompleto=" + esTiempoCompleto +
                ", horasTrabajadas=" + horasTrabajadas +
                ", bonificaciones=" + bonificaciones +
                '}';
    }
}
