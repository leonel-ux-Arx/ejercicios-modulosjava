package Proyecto_Unidad5.Gestion_de_tareas;

public class Entidad {
    private String descripcion;
    private String prioridad;
    private boolean completada;

    public Entidad (String descripcion, String prioridad, boolean completada) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }

    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    public void marcarCompletada() {
        completada = true;
    }

    public boolean esUrgente() {
        return prioridad.equalsIgnoreCase("Alta") && !completada;
    }
}
