package Proyecto_Unidad5.Procesamiento_de_cadenas;

public class Entidad {
    private String cadena;
    private String id;
    private int maxLongitud;

    public Entidad (String cadena, String id, int maxLongitud) {
        this.cadena = cadena;
        this.id = id;
        this.maxLongitud = maxLongitud;
    }

    public String getCadena() { return cadena; }
    public void setCadena(String cadena) { this.cadena = cadena; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public int getMaxLongitud() { return maxLongitud; }
    public void setMaxLongitud(int maxLongitud) { this.maxLongitud = maxLongitud; }

    public String agregarPrefijo(String prefijo) {
        return prefijo + cadena;
    }

    public int contarEspacios() {
        int cont = 0;
        for (char c : cadena.toCharArray()) {
            if (c == ' ') cont++;
        }
        return cont;
    }
}

