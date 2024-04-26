package Practicas_6_al_13;

public class pract9_colores {
String nombres;

    public pract9_colores(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "pract9_colores{" +
                "nombres='" + nombres + '\'' +
                '}';
    }
}

