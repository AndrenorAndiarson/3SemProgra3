package Practica14_al_33;

import POO.Persona;

import java.util.Collections;
import java.util.Stack;

public class Pract24 {
    public static void main(String[] args) {
        //Crear una lista de objetos "Personas" y ordenarla alfabéticamente por su nombre.
        Stack<String> pila=new Stack<>();
        pila.push("Doc");
        pila.push("Dre");
        pila.push("Yisus");
        pila.push("Big Show");
        pila.push("Cabo");
        pila.push("Gaylord");
        pila.push("Mery Jane");
        pila.push("Sucha");
        System.out.println(pila);
        Collections.sort(pila);
        System.out.println("Pila ordenada: ");
        System.out.println(pila);

    }
}
