package Registro_De_Materias;

import java.util.ArrayList;
import java.util.Scanner;

public class Reg {
    public static void main(String[] args) {


        String nombreAlumno = "", nombreMat = "";
        ArrayList<String> aprobados = new ArrayList<>();
        ArrayList<String> reprobados = new ArrayList<>();
        double nota = 0.0;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int totalCursos = 0, totalAlumnos = 0;
        Persona[] per = new Persona[totalAlumnos];
        System.out.println("Ingrese el total de alumnos:");
        totalAlumnos = sc.nextInt();
        System.out.println("Ingrese el total de materias:");
        totalCursos = sc.nextInt();
        Persona[] al = new Persona[totalAlumnos];
        Materia[] c = new Materia[totalCursos];
        for (int i = 0; i < totalAlumnos; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + " :");
            nombreAlumno = sc.next();
            Persona a = new Persona(nombreMat, totalCursos);
            for (int j = 0; j < totalCursos; j++) {
                System.out.println("Ingrese el nombre de la Materia " + (j + 1) + " :");
                nombreMat = sc.next();
                System.out.println("Ingrese la nota:");
                nota = sc.nextDouble();
                Materia mat = new Materia(nombreMat, nota);
                c[j] = mat;

            }
            a.agregarMateria(c);
            al[i] = a;
        }}}
/*public void mostrarDatos(Persona persona : al) {

        }
){
            for (int i=0;i<al.length;i++){
                System.out.println("Alumno "+(i+1));
                System.out.println(al[i].toString());
            }
        }
    }
