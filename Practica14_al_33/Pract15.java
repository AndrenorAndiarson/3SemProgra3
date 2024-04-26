package Practica14_al_33;

import java.util.Stack;

public class Pract15 {
    public static void main(String[] args) {
        //Crear una pila de cadenas de caracteres y verificar si está vacía.
        Stack<String> pila=new Stack<>();
        if (pila.isEmpty()){
            System.out.println("Esta vacia");
        }else {
            System.out.println("Contiene elementos");
        }

        System.out.println("---AGREGAMOS UN ELEMENTO---");
pila.push("hola");
        if (pila.isEmpty()){
            System.out.println("Esta vacia");
        }else {
            System.out.println("Contiene elementos");
        }
    }
}
