package Proyecto_Unidad5.Procesamiento_de_cadenas;

public class Main{
    public static void main(String[] args) {

        Entidad cad = new Entidad ("Hola mundo en Java", "CT01", 50);

        System.out.println(cad.agregarPrefijo(">>> "));
        System.out.println("Espacios: " + cad.contarEspacios());
    }
}

