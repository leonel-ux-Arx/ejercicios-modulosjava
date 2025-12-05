package Proyecto_Unidad5.Control_de_inventario;

public class Entidad {
    private String referencia;
    private int cantidad;
    private double precioUnitario;

    public Entidad (String referencia, int cantidad, double precioUnitario) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    public void agregarStock(int entrada) {
        cantidad += entrada;
    }

    public double valorTotal() {
        return cantidad * precioUnitario;
    }
}
