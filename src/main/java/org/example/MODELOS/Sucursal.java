package org.example.MODELOS;

public class Sucursal {
    //10 datos
    private Long id;
    private String nombre;
    private String direccion;
    private String codigo;
    private String gerente;
    private String telefono;
    private String email;
    private Integer numeroEmpleados;
    private Double presupuestoAnual;
    private String ciudad;
    private String pais;

    public Sucursal() {
    }

    public Sucursal(Long id, String nombre, String direccion, String codigo, String gerente, String telefono, String email, Integer numeroEmpleados, Double presupuestoAnual, String ciudad, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigo = codigo;
        this.gerente = gerente;
        this.telefono = telefono;
        this.email = email;
        this.numeroEmpleados = numeroEmpleados;
        this.presupuestoAnual = presupuestoAnual;
        this.ciudad = ciudad;
        this.pais = pais;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(Double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigo='" + codigo + '\'' +
                ", gerente='" + gerente + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", presupuestoAnual=" + presupuestoAnual +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
