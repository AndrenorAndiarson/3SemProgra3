package Practica14_al_33;

public class Pract26_Animal {
    String nombre;
    String Especie;

    public Pract26_Animal(String nombre, String especie) {
        this.nombre = nombre;
        Especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    @Override
    public String toString() {
        return "Pract26_Animal{" +
                "nombre='" + nombre + '\'' +
                ", Especie='" + Especie + '\'' +
                '}';
    }
}
