package Practica14_al_33;

public class Pract30_Producto {
    String nombre;

    public Pract30_Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pract30_Producto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
