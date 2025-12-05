package Proyecto_Unidad5.Control_empleados;

public class Main{
    public static void main(String[] args) {

        Entidad e = new Entidad ("EMP01", 8000, 10);

        System.out.println("Salario neto: " + e.salarioNeto());

        e.aplicarAumento(15);
        System.out.println("Salario con aumento: " + e.getSalarioMensual());
    }
}
