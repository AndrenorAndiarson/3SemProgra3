package Registro_De_Materias;

public class Materia {
     String materia;
    double nota;
    //const


    public Materia(String nombreMat, double nota) {
    }
    //gettersetter

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "materia='" + materia + '\'' +
                ", nota=" + nota +
                '}';
    }
}
