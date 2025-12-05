package Proyecto_Unidad5.Temperatura_y_clima;

public class Entidad {
    private double valor;
    private String unidad;
    private String fechaRegistro;

    public Entidad (double valor, String unidad, String fechaRegistro) {
        this.valor = valor;
        this.unidad = unidad;
        this.fechaRegistro = fechaRegistro;
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad; }

    public String getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public void convertir() {
        if (unidad.equalsIgnoreCase("Celsius")) {
            valor = (valor * 9/5) + 32;
            unidad = "Fahrenheit";
        } else {
            valor = (valor - 32) * 5/9;
            unidad = "Celsius";
        }
    }

    public boolean esExtrema() {
        if (unidad.equalsIgnoreCase("Celsius"))
            return valor > 40;
        else
            return valor > 104;
    }
}
