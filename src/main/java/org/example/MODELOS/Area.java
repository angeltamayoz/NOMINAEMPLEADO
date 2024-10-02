package org.example.MODELOS;

public class Area {
    //10 datos
    private Long id;
    private String nombre;
    private String descripcion;
    private String codigo;
    private String gerente;
    private Integer numeroEmpleados;
    private Double presupuesto;
    private String ubicacion;
    private String telefono;
    private String email;
    private Boolean esCritica;

    public Area() {
    }

    public Area(Long id, String nombre, String descripcion, String codigo, String gerente, Integer numeroEmpleados, Double presupuesto, String ubicacion, String telefono, String email, Boolean esCritica) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.gerente = gerente;
        this.numeroEmpleados = numeroEmpleados;
        this.presupuesto = presupuesto;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.email = email;
        this.esCritica = esCritica;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public Boolean getEsCritica() {
        return esCritica;
    }

    public void setEsCritica(Boolean esCritica) {
        this.esCritica = esCritica;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", codigo='" + codigo + '\'' +
                ", gerente='" + gerente + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", presupuesto=" + presupuesto +
                ", ubicacion='" + ubicacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", esCritica=" + esCritica +
                '}';
    }
}
