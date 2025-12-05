package Proyecto_Unidad5.Gestion_Libros;

public class Entidad {
    private String id;
    private String autor;
    private boolean prestado;

    public Entidad (String id, String autor, boolean prestado) {
        this.id = id;
        this.autor = autor;
        this.prestado = prestado;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public boolean isPrestado() { return prestado; }
    public void setPrestado(boolean prestado) { this.prestado = prestado; }

    public void reservar() {
        prestado = true;
    }

    public boolean esAptoParaPrestamo(int años) {
        return años > 5;
    }
}
