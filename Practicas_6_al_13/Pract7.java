package Practicas_6_al_13;

import java.util.LinkedList;
import java.util.Queue;

public class Pract7 {
    public static void main(String[] args) {
//Crear una cola y agregar los elementos "A", "B", "C", "D" y "E".
// Luego, vaciar la cola y agregar los elementos "F", "G", "H",
// "I" y "J". Finalmente, imprimir los elementos de la cola. //
        Queue<String> cola=new LinkedList<>();
        cola.offer("A");
        cola.offer("B");
        cola.offer("C");
        cola.offer("D");
        cola.offer("E");
        for (String i:cola) {
            System.out.println(i);
        }
        cola.clear();
        cola.add("G");
        cola.add("H");
        cola.add("I");
        cola.add("J");
        cola.add("K");
        for (String i:cola) {
            System.out.println(i);
        }
    }
}
