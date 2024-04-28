package Practica14_al_33;

import java.util.Scanner;
import java.util.Stack;

public class Pract20 {
    public static void main(String[] args) {
        //Crear una pila de cadenas de caracteres y eliminar
        // todas las ocurrencias de una cadena dada.

        Stack<String> pila = new Stack<>();

        pila.push("a");
        pila.push("b");
        pila.push("c");
        pila.push("d");
        pila.push("e");

        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese la letra que desea eliminar de la pila: ");
        String Eliminar = sc.nextLine();

        Stack<String> nuevaPila = new Stack<>();

        for (String elemento : pila) {
            if (!elemento.equals(Eliminar)) {
                nuevaPila.push(elemento);
            }
        }
        System.out.println("Pila después de eliminar "+Eliminar+" de las ocurrencias de '" + pila + "':");
        while (!nuevaPila.isEmpty()) {
            System.out.println(nuevaPila.pop());
        }
        sc.close();

    }
}
