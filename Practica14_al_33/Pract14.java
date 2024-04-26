package Practica14_al_33;

import java.util.Stack;

public class Pract14 {
    public static void main(String[] args) {
        //Crear una pila vacía y agregar elementos a ella. Luego,
        // mostrar los elementos de la pila en el orden inverso al que se agregaron.

        Stack<Integer> pila=new Stack<>();
        Stack<Integer> pila2=new Stack<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        System.out.println("Original:");
        System.out.println(pila);

        while (!pila.isEmpty()){
            int revertir=pila.pop();
            pila2.push(revertir);
        }
        System.out.println("Inverso:");
        System.out.println(pila2);

    }
}
