package Proyecto_Unidad5.Gestion_de_tareas;

public class Main{
    public static void main(String[] args) {

        Entidad tarea = new Entidad ("Proyecto final", "Alta", false);

        System.out.println("¿Urgente?: " + tarea.esUrgente());

        tarea.marcarCompletada();
        System.out.println("¿Completada?: " + tarea.isCompletada());
    }
}
