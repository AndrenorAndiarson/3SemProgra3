package Practica14_al_33;

public class Pract27_Estudiante {
String nombre;
int [] notas;

    public Pract27_Estudiante(String nombre, int[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularPromedio(){
        int sum=0;
        for (int nota: notas){
            sum+= nota;
        }
        return (double) sum/notas.length;
    }
}
