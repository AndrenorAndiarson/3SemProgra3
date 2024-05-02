package Practica14_al_33;

import java.util.Scanner;
import java.util.Stack;

public class Pract31 {
    public static void main(String[] args) {
        //Crear una lista de objetos "Empleado" y calcular el salario promedio.
        Stack<Pract31_Empleado> pila=new Stack<>();
        Stack<Pract31_Empleado> pila2=new Stack<>();

        Scanner sc=new Scanner(System.in);
        Scanner st=new Scanner(System.in);
        pila.push(new Pract31_Empleado("Juan", 310));
        pila.push(new Pract31_Empleado("María", 400));
        pila.push(new Pract31_Empleado("Pedro", 350));
        pila.push(new Pract31_Empleado("Ana", 450));
        System.out.println("Lista: ");
        System.out.println(pila);

        double prom=0;
        for (Pract31_Empleado empleado : pila) {
             prom+=empleado.getSalario();
        }
        System.out.println("TOTAL: "+ prom);
        System.out.println("Promedio: "+prom/pila.size());


    }
}
