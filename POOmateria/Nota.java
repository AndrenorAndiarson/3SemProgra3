package POOmateria;

public class Nota {
    private Materia materia;
    private double calificacion;

    public Nota(Materia materia, double calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return materia + ": " + calificacion;
    }
}