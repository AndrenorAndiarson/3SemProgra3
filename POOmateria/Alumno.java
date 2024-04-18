package POOmateria;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    List <Nota> notas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Materia materia, double calificacion) {
        Nota nuevaNota = new Nota(materia, calificacion);
        notas.add(nuevaNota);
    }

    public void eliminarNota(Materia materia) {
        notas.removeIf(nota -> nota.getMateria().equals(materia));
    }

    public void mostrarNotas() {
        System.out.println("Notas de " + nombre + ":");
        for (Nota nota : notas) {
            System.out.println(nota);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
