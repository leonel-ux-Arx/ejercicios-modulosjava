package Proyecto_Unidad5.Control_de_inventario;

public class Main {
    public static void main(String[] args) {

        Entidad prod = new Entidad("A100", 10, 25.50);

        prod.agregarStock(5);
        System.out.println("Cantidad: " + prod.getCantidad());
        System.out.println("Valor total: " + prod.valorTotal());
    }
}
