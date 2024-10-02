package org.example.MODELOS;

public class Nomina {
    //10 datos
    private Long id;
    private Empleado empleado;
    private Double salarioBruto;
    private Double deducciones;
    private Double salarioNeto;
    private Double impuestos;
    private Double horasExtras;
    private Double pagoHorasExtras;
    private Double bonificaciones;
    private String periodoPago;
    private String fechaPago;

    public Nomina() {
    }

    public Nomina(Long id, Empleado empleado, Double salarioBruto, Double deducciones, Double salarioNeto, Double impuestos, Double horasExtras, Double pagoHorasExtras, Double bonificaciones, String periodoPago, String fechaPago) {
        this.id = id;
        this.empleado = empleado;
        this.salarioBruto = salarioBruto;
        this.deducciones = deducciones;
        this.salarioNeto = salarioNeto;
        this.impuestos = impuestos;
        this.horasExtras = horasExtras;
        this.pagoHorasExtras = pagoHorasExtras;
        this.bonificaciones = bonificaciones;
        this.periodoPago = periodoPago;
        this.fechaPago = fechaPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(Double deducciones) {
        this.deducciones = deducciones;
    }

    public Double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(Double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public Double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    public Double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Double getPagoHorasExtras() {
        return pagoHorasExtras;
    }

    public void setPagoHorasExtras(Double pagoHorasExtras) {
        this.pagoHorasExtras = pagoHorasExtras;
    }

    public Double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(Double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public String getPeriodoPago() {
        return periodoPago;
    }

    public void setPeriodoPago(String periodoPago) {
        this.periodoPago = periodoPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "id=" + id +
                ", empleado=" + empleado +
                ", salarioBruto=" + salarioBruto +
                ", deducciones=" + deducciones +
                ", salarioNeto=" + salarioNeto +
                ", impuestos=" + impuestos +
                ", horasExtras=" + horasExtras +
                ", pagoHorasExtras=" + pagoHorasExtras +
                ", bonificaciones=" + bonificaciones +
                ", periodoPago='" + periodoPago + '\'' +
                ", fechaPago='" + fechaPago + '\'' +
                '}';
    }
}
