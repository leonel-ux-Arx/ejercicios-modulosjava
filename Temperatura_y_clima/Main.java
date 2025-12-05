package Proyecto_Unidad5.Temperatura_y_clima;

public class Main {
    public static void main(String[] args) {

        Entidad temp = new Entidad (38, "Celsius", "2025-01-01");

        System.out.println("¿Extrema?: " + temp.esExtrema());

        temp.convertir();
        System.out.println(temp.getValor() + " " + temp.getUnidad());
    }
}
