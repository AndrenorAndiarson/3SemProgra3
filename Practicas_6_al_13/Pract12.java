package Practicas_6_al_13;

import java.util.LinkedList;
import java.util.Queue;

public class Pract12 {
    public static void main(String[] args) {
        //Crear dos colas y agregar los elementos "A", "B", "C", "D" y "E" en la primera cola,
        // y los elementos "1", "2", "3", "4" y "5" en la segunda cola.
        // Luego, intercalar los elementos de las dos colas en una tercera cola y imprimir los elementos de la tercera cola.

        Queue<Object> cola1 = new LinkedList();
        Queue<Object> cola2 = new LinkedList();
        cola1.add("A");
        cola1.add("B");
        cola1.add("C");
        cola1.add("D");
        cola1.add("E");
        cola1.add("F");

        cola2.add(1);
        cola2.add(2);
        cola2.add(3);
        cola2.add(4);
        cola2.add(5);
        Queue<Object> cola3 = new LinkedList<>();

        while (!cola1.isEmpty() || !cola2.isEmpty()) {
            if (!cola1.isEmpty()) {
                cola3.add(cola1.poll());
            }
            if (!cola2.isEmpty()) {
                cola3.add(cola2.poll());
            }
        }

        System.out.println("Elementos de la tercera cola: ");
        while (!cola3.isEmpty()) {
            System.out.println(cola3.poll());
        }
    }
}