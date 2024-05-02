package Practica14_al_33;

import java.util.List;
import java.util.Stack;

public class Pract27 {
//Crear una lista de objetos "Estudiante" y encontrar el estudiante con el promedio más alto.
public static void main(String[] args) {

    Stack <Pract27_Estudiante> pila=new Stack<>();
    pila.push(new Pract27_Estudiante("Dre",new int[]{90,80,100}));
    pila.push(new Pract27_Estudiante("Yisus",new int[]{90,90,80}));
    pila.push(new Pract27_Estudiante("Doc",new  int[] {90,70,80}));
    pila.push(new Pract27_Estudiante("Cabo",new int[]{90,100,90}));
    pila.push(new Pract27_Estudiante("Lili",new int[]{90,100,85}));
    pila.push(new Pract27_Estudiante("Dengue",new int[]{90,70,70}));
    System.out.println("NOTAS:");
    System.out.println(pila);
    System.out.println("MEJOR ESTUDIANTE: ");

double maxPromedio = Double.MIN_VALUE;
Pract27_Estudiante mejorEstudiante = null;
for (Pract27_Estudiante estudiante:pila){
    double promedio= estudiante.calcularPromedio();
    if (promedio>maxPromedio){
        maxPromedio=promedio;
        mejorEstudiante=estudiante;
    }
}

if (mejorEstudiante!=null){
    System.out.println(mejorEstudiante.getNombre());
}

}
}