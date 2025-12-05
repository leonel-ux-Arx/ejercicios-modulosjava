package Proyecto_Unidad5.Control_empleados;

public class Entidad {
    private String clave;
    private double salarioMensual;
    private double porcentajeRetencion;

    public Entidad (String clave, double salarioMensual, double porcentajeRetencion) {
        this.clave = clave;
        this.salarioMensual = salarioMensual;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public double getSalarioMensual() { return salarioMensual; }
    public void setSalarioMensual(double salarioMensual) { this.salarioMensual = salarioMensual; }

    public double getPorcentajeRetencion() { return porcentajeRetencion; }
    public void setPorcentajeRetencion(double porcentajeRetencion) { this.porcentajeRetencion = porcentajeRetencion; }

    public double salarioNeto() {
        return salarioMensual - (salarioMensual * porcentajeRetencion / 100);
    }

    public void aplicarAumento(double porcentaje) {
        salarioMensual += salarioMensual * porcentaje / 100;
    }
}
