package Registro_De_Materias;

public class Persona {
private String nombre;
private String apellidos;
private int totalCurso;
private Materia [] materia;
//const

    public Persona(String nombre, int totalCurso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.totalCurso = totalCurso;
        this.materia = new  Materia[totalCurso];
    }

    //gettersetter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTotalCurso() {
        return totalCurso;
    }

    public void setTotalCurso(int totalCurso) {
        this.totalCurso = totalCurso;
    }

    public Materia[] getMateria() {
        return materia;
    }

    public void setMateria(Materia[] materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        String s= "Nombre: "+ this.nombre+"\n";
        for (int i=0;i<this.materia.length;i++){
s += this.materia[i].toString();
        }
        return s;
    }

    public void agregarMateria (Materia [] c){
        System.arraycopy(c,0,this.materia,0,c.length);
}
}

