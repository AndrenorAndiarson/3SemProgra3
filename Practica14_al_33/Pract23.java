package Practica14_al_33;

import javax.lang.model.element.Element;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Pract23 {
    public static void main(String[] args) {
        //Crear una pila de objetos de tipo Empleado y mostrar los nombres de los empleados que tienen un salario mayor que un valor dado.

        Stack<Pract23_Empleado> pila=new Stack<>();
        Stack<Pract23_Empleado> pila2=new Stack<>();

        Scanner sc=new Scanner(System.in);
        Scanner st=new Scanner(System.in);
        pila.push(new Pract23_Empleado("Juan", 3000));
        pila.push(new Pract23_Empleado("María", 4000));
        pila.push(new Pract23_Empleado("Pedro", 3500));
        pila.push(new Pract23_Empleado("Ana", 4500));
        System.out.println("Lista: ");
        System.out.println(pila);

        System.out.println("Ingrese un salario promedio: ");
double prom;
prom= sc.nextDouble();

        System.out.println("Empleados con salario mayor que " + prom + ":");
        for (Pract23_Empleado empleado : pila) {
            if (empleado.getSalario() > prom) {
                System.out.println(empleado.toString());



            }
        }



    }
}
