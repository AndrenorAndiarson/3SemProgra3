package Practica14_al_33;

import java.util.Stack;

public class Pract17 {
    public static void main(String[] args) {
        //Crear una pila de objetos de tipo Persona y mostrar la
        // información de cada objeto.
        Stack<Object> persona=new Stack<>();
        persona.push("Juan");
        persona.push("María");
        persona.push("Pedro");
        persona.push("Ana");

        System.out.println(persona);
    }
}
