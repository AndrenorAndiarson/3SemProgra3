package Practicas_6_al_13;

import java.util.LinkedList;
import java.util.Queue;

public class Pract11 {
    public static void main(String[] args) {
        //Crear una cola y agregar los elementos "1", "2", "3", "4", "5", "6", "7", "8", "9" y "10".
        // Luego, iterar la cola utilizando un bucle for y sumar los elementos impares. Finalmente, imprimir la suma.
        Queue<Integer> cola = new LinkedList();
        Queue<Integer>imp=new LinkedList<>();
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
        int impares;
        for (int i = 1; i <=cola.size(); i += 2) {
            imp=cola.add(i);
        }

        System.out.println("cola");
        System.out.println(cola);
            }
        }


