package Practicas_6_al_13;

import java.util.LinkedList;
import java.util.Queue;

public class Pract10 {
    //Crear una cola y agregar los elementos "1", "2", "3", "4", "5", "6", "7", "8", "9" y "10".
    // Luego, iterar la cola utilizando un bucle while y eliminar los elementos pares.
    // Finalmente, imprimir los elementos de la cola.
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);
        cola.add(6);
        cola.add(7);
        cola.add(8);
        cola.add(9);
        cola.add(10);
        while (!cola.isEmpty()){
        int pares=cola.poll();
            if (pares%2==0){
            System.out.println(pares);
        }

        }
    }
}