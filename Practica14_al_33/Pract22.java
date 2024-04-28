package Practica14_al_33;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class Pract22 {
    public static void main(String[] args) {
        //Crear una pila de cadenas de caracteres y ordenarla en orden alfabético. (    Collections.sort(pila)   )

        Stack<String> pila=new Stack<>();


        pila.push("a");
        pila.push("z");
        pila.push("d");
        pila.push("f");
        pila.push("s");
        pila.push("r");
        pila.push("e");
        pila.push("w");
        pila.push("q");
        System.out.println(pila);
        Collections.sort(pila);
        System.out.println("Pila ordenada: ");
        System.out.println(pila);

    }
}
