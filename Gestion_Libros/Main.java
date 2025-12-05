package Proyecto_Unidad5.Gestion_Libros;

class Main{
    public static void main(String[] args) {

        Entidad libro = new Entidad ("L101", "Juan Rulfo", false);

        libro.reservar();
        System.out.println("Prestado: " + libro.isPrestado());

        System.out.println("¿Apto para préstamo?: " + libro.esAptoParaPrestamo(10));
    }
}
